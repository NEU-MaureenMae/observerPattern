public class NewsSubscriptionService {
    public static void main(String[] args) {
        ConcreteNewsAgency newsAgency = new ConcreteNewsAgency();
        System.out.println("AAA NEWS SUBSCRIPTION SERVICE\n");

        // Creating subscribers
        Subscriber subscriber1 = new ConcreteSubscriber("User1");
        Subscriber subscriber2 = new ConcreteSubscriber("User2");
        Subscriber subscriber3 = new ConcreteSubscriber("User3");

        // Registering subscribers
        newsAgency.registerSubscriber(subscriber1);
        newsAgency.registerSubscriber(subscriber2);
        newsAgency.registerSubscriber(subscriber3);

        // Publishing breaking news
        newsAgency.publishNews("\"COVID-19 Update: New Variant Detected\"");
        System.out.println();

        // Subscriber 2 unsubscribes
        newsAgency.removeSubscriber(subscriber2);
        newsAgency.removeSubscriber(subscriber3);
        System.out.println();

        // Publishing more breaking news
        newsAgency.publishNews("\"Election Results Announced\"");
        System.out.println();
    }
}
