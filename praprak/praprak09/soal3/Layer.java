import java.util.ArrayList;
import java.util.List;

public class Layer {
    private final List<Neuron> neurons;

    public Layer(List<Neuron> neurons) {
        // TODO:
        // Inisialisasi atribut neurons menggunakan list neuron dari parameter.
        this.neurons = neurons;
    }

    public List<Double> forward(List<Double> inputs) {
        List<Double> outputs = new ArrayList<>();

        for (Neuron neuron : neurons) {
            double out = neuron.computeOutput(inputs);
            outputs.add(out);
        }

        return outputs;
    }

}
