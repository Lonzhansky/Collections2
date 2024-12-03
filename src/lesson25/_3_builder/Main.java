package lesson25._3_builder;

class Notification {
    private String recipient;
    private String title;
    private String body;

    private Notification(Builder builder) {
        this.recipient = builder.recipient;
        this.title = builder.title;
        this.body = builder.body;
    }

    public static class Builder {
        private String recipient;
        private String title;
        private String body;

        public Builder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }
    }

    @Override
    public String toString() {
        return "Notification to " + recipient + ": " + title + " - " + body;
    }
}

// Використання:
public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification.Builder()
                .setRecipient("user@example.com")
                .setTitle("Builder Example")
                .setBody("Hello, this is a built notification!")
                .build();

        System.out.println(notification);
    }
}
