package com.OpenMLava.NeuralNetwork.SignalCollectors;

import java.util.List;

import com.OpenMLava.NeuralNetwork.NeuronConnection;

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
	double collectPrevLayerOutput(List<NeuronConnection> inputConnections);
}
