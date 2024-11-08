package Round2.Assignment.Recursion;

public class StepCount {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(stepCount(n, 0));
    }

    static int stepCount(int step, int currentStep) {

        if (step == 0) {
            return 0;
        }
        if (step == currentStep) {
            return 1;
        }
        if (currentStep > step) {
            return 0;
        }
        int firstStep = stepCount(step, currentStep + 1);
        int secondStep = stepCount(step, currentStep + 2);

        return firstStep + secondStep;
    }
}
