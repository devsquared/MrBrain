package main.java.com.MrBrain.ActivationFunctions;

public class SinusoidFunction implements ActivationFunction
{
	@Override
	public double calculateOutput(double summedInput)
	{
		return Math.sin(summedInput);
	}
}
