package main.java.com.MrBrain.SignalCollectors;

import java.util.List;

public interface SignalCollector
{
    public double collectPrevLayerOutput(List<main.java.com.MrBrain.NeuronConnection> inputConnections);
}
