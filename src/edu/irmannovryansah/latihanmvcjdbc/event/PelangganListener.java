/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irmannovryansah.latihanmvcjdbc.event;

import edu.irmannovryansah.latihanmvcjdbc.entity.Pelanggan;
import edu.irmannovryansah.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Irman Novryansah
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);

    public void onChange(Pelanggan pelanggan);
    
}
