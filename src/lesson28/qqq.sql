-- Створення таблиці Users
CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL
);


-- Створення таблиці Orders
CREATE TABLE IF NOT EXISTS orders (
    order_id SERIAL PRIMARY KEY,
    order_date DATE NOT NULL,
    order_cost NUMERIC(10, 2) NOT NULL, -- Вартість замовлення
    user_id INT
);

-- Додавання зовнішнього ключа
ALTER TABLE orders
ADD CONSTRAINT fk_user_orders
FOREIGN KEY (user_id)
REFERENCES users(id);



-- Заповнення таблиці Users
INSERT INTO users (name, email) VALUES
('Ivan Ivanov', 'ivan@example.com'),
('Maria Petrova', 'maria@example.com'),
('Oleg Shevchenko', 'oleg@example.com'),
('Svitlana Kharchenko', 'svitlana@example.com');



-- Заповнення таблиці Orders
INSERT INTO orders (order_date, order_cost, user_id) VALUES
('2024-01-01', 250.00, 1),
('2024-01-05', 450.50, 2),
('2024-01-10', 300.00, 3),
('2023-12-20', 150.00, 1),
('2023-12-25', 500.00, 2),
('2023-11-15', 200.00, 4),
('2023-11-25', 350.00, 4),
('2023-10-10', 600.00, 2),
('2023-09-01', 100.00, 1),
('2023-08-15', 700.00, 3);


--поверне 3 рядки з таблиці "orders", пропустивши перші 5 рядків, тобто рядки з 6-го по 8-й.
SELECT * FROM orders LIMIT 3 OFFSET 5;


--Групуємо замовлення за користувачами, 
--підраховуємо кількість замовлень і загальну вартість для кожного користувача.
SELECT 
    user_id,
    COUNT(order_id) AS order_count,
    SUM(order_cost) AS total_cost
FROM orders
GROUP BY user_id;


--Вибираємо тільки тих користувачів, у яких загальна вартість замовлень перевищує 800.
SELECT 
    user_id,
    COUNT(order_id) AS order_count,
    SUM(order_cost) AS total_cost
FROM orders
GROUP BY user_id
HAVING SUM(order_cost) > 800;



INSERT INTO orders (order_date, order_cost, user_id) VALUES
('2024-01-15', 250.00, 1),  -- Дублікат для перевірки
('2024-01-15', 250.00, 1),  -- Той самий запис
('2024-02-01', 350.00, 2),
('2024-02-05', 300.00, 3),  -- Граничне значення для категорії
('2024-02-10', 450.00, 4);



-- Демонстрація UNION
SELECT order_date, order_cost, user_id, 'Large Orders' AS category
FROM Orders
WHERE order_cost > 300
UNION 
SELECT order_date, order_cost, user_id, 'Small Orders' AS category
FROM Orders
WHERE order_cost <= 300
ORDER BY category;


ALTER TABLE users
ADD COLUMN balance DECIMAL(10, 2) DEFAULT 0.00;


SELECT * FROM users;

SELECT * FROM orders;

UPDATE users
SET balance = 100.00;



DO $$
DECLARE
    user_balance DECIMAL(10, 2);
BEGIN
    -- Перевірка балансу користувача
    SELECT balance INTO user_balance FROM users WHERE id = 1;

    -- Перевірка, чи є достатньо коштів
    IF user_balance >= 50.00 THEN
        -- Додавання нового замовлення
        INSERT INTO orders (user_id, order_date, order_cost)
        VALUES (1, '2024-12-13', 50.00);

        -- Оновлення балансу користувача
        UPDATE users
        SET balance = balance - 50.00
        WHERE id = 1;

        -- Підтвердження транзакції
        COMMIT;
        RAISE NOTICE 'Замовлення успішно додано!';
    ELSE
        -- Якщо коштів недостатньо, скасовуємо транзакцію
        ROLLBACK;
        RAISE NOTICE 'Недостатньо коштів для здійснення покупки!';
    END IF;
END $$;



SELECT * FROM users

SELECT * FROM orders;   

DELETE FROM orders WHERE order_id = 23



BEGIN;  -- Початок транзакції

-- Вставка першого замовлення
INSERT INTO orders (user_id, order_date, order_cost)
    VALUES (2, '2024-12-15', 100.00);

-- Створення першого SAVEPOINT
SAVEPOINT first_savepoint;

-- Вставка другого замовлення
INSERT INTO orders (user_id, order_date, order_cost)
    VALUES (2, '2024-12-16', 200.00);

-- Створення другого SAVEPOINT
SAVEPOINT second_savepoint;

-- Вставка третього замовлення
INSERT INTO orders (user_id, order_date, order_cost)
    VALUES (2, '2024-12-17', 300.00);

-- Скасування до другого SAVEPOINT (припиняємо дію третього замовлення)
ROLLBACK TO SAVEPOINT second_savepoint;
--SELECT * FROM orders;  -- показує перші два замовлення

-- Вивільнення другого SAVEPOINT
RELEASE SAVEPOINT second_savepoint;

-- Скасування до першого SAVEPOINT (припиняємо дію другого та третього замовлення)
ROLLBACK TO SAVEPOINT first_savepoint;
--SELECT * FROM orders;  -- показує тільки перше замовлення

-- Завершення транзакції
COMMIT;





