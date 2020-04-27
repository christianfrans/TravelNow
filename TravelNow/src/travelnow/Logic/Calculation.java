/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelnow.Logic;

import travelnow.Model.MainModel;

/**
 *
 * @author user
 */
public class Calculation extends MainModel{
	@Override
	public int calculate(int a, int b, int c, int d){
		return (a * b) + (a * c) + (a * d);
	}
}
