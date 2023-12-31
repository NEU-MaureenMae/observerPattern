class ConcreteSubscriber implements Subscriber {
    private String subscriberName;

    public ConcreteSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String news) {
        System.out.println(subscriberName + " received news: " + news);
    }
}