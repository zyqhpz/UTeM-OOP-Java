import java.util.ArrayList;

public class Calculator {
    float getMin(ArrayList<Float> values) {
        float val[] = new float[values.size()];

        for (Float value : values) {
            val[values.indexOf(value)] = value;
        }

        float min = val[0];
        for (int j = 1; j < val.length; j++) {
            min = Math.min(min, val[j]);
        }
        return min;
    }

    public float getMax(ArrayList<Float> values) {
        float val[] = new float[values.size()];

        for (Float value : values) {
            val[values.indexOf(value)] = value;
        }

        float max = val[0];
        for (int j = 1; j < val.length; j++) {
            max = Math.max(max, val[j]);
        }
        return max;
    }

    public float getAverage(ArrayList<Float> values) {
        float val[] = new float[values.size()];
        for (Float value : values) {
            val[values.indexOf(value)] = value;
        }

        float average = 0;
        for (int j = 0; j < val.length; j++) {
            average += val[j];
        }

        return average / val.length;
    }

    public float getSum(ArrayList<Float> values) {
        float val[] = new float[values.size()];

        for (Float value : values) {
            val[values.indexOf(value)] = value;
        }

        float sum = 0;
        for (int j = 1; j < val.length; j++) {
            sum += val[j];
        }
        return sum;
    }
}