package com.MrBrain.NeuralNetwork;

public interface NeuralNetwork
{
	/**
	 * Given a matrix of input data, train the neural network.
	 *
	 * @param data
	 * 			Matrix of training data
	 */
	void train(Object[][] data);

	/**
	 * Predict an outcome based on the weights that are currently in the neural network.
	 *
	 * @return
	 * 			double
	 */
	// TODO: Could return a "prediction" object that we could create that would have meta data as well as an Object return type for the prediction.
	double predict();
}
