package NeuralNet;

import java.util.List;

public interface SignalCollector
{
    public double collectPrevLayerOutput(List<NeuronConnection> inputConnections);
}
