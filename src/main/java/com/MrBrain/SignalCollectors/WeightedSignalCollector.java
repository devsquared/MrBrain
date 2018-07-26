package main.java.com.MrBrain.SignalCollectors;

import java.util.List;

public class WeightedSignalCollector implements SignalCollector
{
    @Override
    public double collectPrevLayerOutput(List<main.java.com.MrBrain.NeuronConnection> inputConnections)
    {
        double weightedSum = 0;
        for (main.java.com.MrBrain.NeuronConnection connection : inputConnections)
        {
            weightedSum += connection.getWeightedInput();
        }

        return weightedSum;
    }
}
