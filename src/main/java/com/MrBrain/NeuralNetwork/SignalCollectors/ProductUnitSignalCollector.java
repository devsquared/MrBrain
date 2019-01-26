package com.MrBrain.NeuralNetwork.SignalCollectors;

import com.MrBrain.NeuralNetwork.NeuronConnection;

import java.util.List;

public class ProductUnitSignalCollector implements SignalCollector {

	@Override
	public double collectPrevLayerOutput(List<NeuronConnection> inputConnections)
	{
		//a product unit collector
		double product = 1;
		for (NeuronConnection connection : inputConnections) {
			//multiply the current weighted product by the input raised to the weight value
			product *= Math.pow(connection.getInput(), connection.getWeight());
		}

		return product;

	}
}
