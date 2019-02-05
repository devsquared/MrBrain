package com.OpenMLava.NeuralNetwork.ActivationFunctions;

public interface ActivationFunction
{
	/**
	 * Calculate the output based on implemented activation function.
	 *
	 * @param summedInput
	 * 			combined input to the neuron
	 * @return
	 * 			the output of the neuron
	 */
	double calculateOutput(double summedInput);
}
