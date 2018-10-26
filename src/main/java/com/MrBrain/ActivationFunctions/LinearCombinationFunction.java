package com.MrBrain.ActivationFunctions;

public class LinearCombinationFunction implements ActivationFunction
{
	private double bias;

	@Override
	public double calculateOutput(double summedInput)
	{
		return summedInput + bias;
	}
}
