package com.MrBrain.NeuralNetwork.ActivationFunctions;

public class SinusoidFunction implements ActivationFunction
{
	@Override
	public double calculateOutput(double summedInput)
	{
		return Math.sin(summedInput);
	}
}
