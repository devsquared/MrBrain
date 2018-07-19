package NeuralNet;

import java.util.List;

public class WeightedSignalCollector implements SignalCollector
{
    @Override
    public double collectPrevLayerOutput(List<NeuronConnection> inputConnections)
    {
        double weightedSum;
        for (NeuronConnection connection : inputConnections)
        {
            weightedSum += connection.getWeightedInput();
        }

        return weightedSum;
    }
}
