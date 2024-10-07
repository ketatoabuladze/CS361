public class EvaluationStrategy {

    // Counter for innermost evaluation
    private static int innermostCounter = 0;

    // Counter for outermost evaluation
    private static int outermostCounter = 0;

    // Innermost evaluation
    public static int innermostEvaluation(int n) {
        innermostCounter++;
        if (n <= 0) {
            return 0;
        }
        return n + innermostEvaluation(n - 1);
    }

    // Outermost evaluation
    public static int outermostEvaluation(int n) {
        outermostCounter++;
        if (n <= 0) {
            return 0;
        }
        int result = outermostEvaluation(n - 1);
        return n + result;
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        
        System.out.println("Innermost Evaluation Result: " + innermostEvaluation(n));
        System.out.println("Innermost Evaluations: " + innermostCounter);
        
        // Reset counter for outermost evaluation
        outermostCounter = 0;

        System.out.println("Outermost Evaluation Result: " + outermostEvaluation(n));
        System.out.println("Outermost Evaluations: " + outermostCounter);
    }
}

