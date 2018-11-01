package com.MrBrain.SignalCollectors;

import java.util.List;

import com.MrBrain.NeuronConnection;

/**
 * Signal collector that combines the input connections of a neuron prior to neuron magic.
 */
public interface SignalCollector
{
	/**
	 * Collect the previous layer output.
	 *
	 * @param inputConnections
	 * 			list of input connections
	 * @return
	 * 			double value of calculated input
	 */
	public double collectPrevLayerOutput(List<NeuronConnection> inputConnections);
}
