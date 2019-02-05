package com.OpenMLava.NeuralNetwork.SignalCollectors;

import java.util.List;

import com.OpenMLava.NeuralNetwork.NeuronConnection;

public class WeightedSignalCollector implements SignalCollector
{
    @Override
    public double collectPrevLayerOutput(List<NeuronConnection> inputConnections)
    {
        double weightedSum = 0;
	    for (NeuronConnection connection : inputConnections)
        {
            weightedSum += connection.getWeightedInput();
        }

        return weightedSum;
    }
}
