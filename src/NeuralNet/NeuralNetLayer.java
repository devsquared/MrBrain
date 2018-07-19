package NeuralNet;

import java.util.List;
import java.util.ArrayList;

import NeuralNet.Neuron;

public class NeuralNetLayer
{
	private String id;

	protected List<Neuron> neurons;

	public NeuralNetLayer(String id)
	{
		this.id = id;
		neurons = new ArrayList<>();
	}

	public NeuralNetLayer(String id, List<Neuron> neurons)
	{
		this.id = id;
		this.neurons = neurons;
	}
}
