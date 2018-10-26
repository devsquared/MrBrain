package com.MrBrain.SignalCollectors;

import java.util.List;

import com.MrBrain.NeuronConnection;

public interface SignalCollector
{
	public double collectPrevLayerOutput(List<NeuronConnection> inputConnections);
}
