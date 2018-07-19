package NeuralNet;

import java.util.ArrayList;
import java.util.List;

public class Neuron
{
    private String id;

    protected List<NeuronConnection> inputConnections;

    protected List<NeuronConnection> outputConnections;

    protected SignalCollector signalCollector;

    protected ActivationFunction activationFunction;

    public Neuron()
    {
        inputConnections = new ArrayList<>();
        outputConnections = new ArrayList<>();
    }

    public double calculateOutput()
    {
        double totalInput = signalCollector.collectPrevLayerOutput(inputConnections);
        double finalOutput = activationFunction.calculateOutput(totalInput);

        return finalOutput;
    }
}
