/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamdev.jxmaps.examples;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Tanjil
 */
public class NewClass {
    public static void main(String[] args) {
        final GeocoderExample mapView = new GeocoderExample();
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("JInternalFrame Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000,600);
 
    JDesktopPane desktop = new JDesktopPane();
 
    JInternalFrame if1 = new JInternalFrame("Frame 1", true, true, true, true );
    if1.setSize(800,500);
    if1.add(mapView);
    
    desktop.add(if1);
    if1.setLocation(20,20);
    if1.setVisible(true);
    frame.add(desktop);
    frame.setVisible(true);
    }
}
