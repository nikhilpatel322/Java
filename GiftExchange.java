public class GiftExchange {
    public static void main(String[] args) {
        int alexGiftValue = 10;
        int benGiftValue = 20;

        System.out.println("Before swapping:");
        System.out.println("Alex's gift value: " + alexGiftValue);
        System.out.println("Ben's gift value: " + benGiftValue);

        /// Swap using a third variable
        int temp = alexGiftValue;
        alexGiftValue = benGiftValue;
        benGiftValue = temp;

        System.out.println("\nAfter swapping using third variable:");
        System.out.println("Alex's gift value: " + alexGiftValue);
        System.out.println("Ben's gift value: " + benGiftValue);

        // /Swap without a third variable
        alexGiftValue = alexGiftValue + benGiftValue;
        benGiftValue = alexGiftValue - benGiftValue;
        alexGiftValue = alexGiftValue - benGiftValue;

        System.out.println("\nAfter swapping without using  third variable:");
        System.out.println("Alex's gift value: " + alexGiftValue);
        System.out.println("Ben's gift value: " + benGiftValue);
    }
}
