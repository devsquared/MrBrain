package NeuralNet;

import java.util.List;

public class Neuron
{
    private String id;

    protected List<NeuronConnection> inputConnections;

    protected List<NeuronConnection> outputConnections;

    protected SignalCollector signalCollector;

    protected ActivationFunction activationFunction;
}
