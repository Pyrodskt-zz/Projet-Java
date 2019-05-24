package model;

import java.util.ArrayList;

import contract.IDimension;
import contract.ILoadMap;

public class LoadMap implements ILoadMap{

	private int number;
	private boolean exit = false;
	//private ArrayList<IEntity> entities;
	private int id;
	//private IHero hero;
	//private IElement elements [] [];
	private IDimension dimension;

public LoadMap (int id, int width, int height, int number) {
	this.dimension = new Dimension (width, height); 
	this.number = number;
	this.id = id;
}


}
