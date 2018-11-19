package com.stasbranger.hypertext;

import org.apache.poi.openxml4j.exceptions.ODFNotOfficeXmlFileException;

import com.stasbranger.hypertext.service.HyperODSService;
import com.stasbranger.hypertext.service.HyperXLSService;

public class HyperTextApplication {

	public static void main(String[] args) {

		if(args == null){
			System.out.println("Not file found.");
			System.exit(0);
		}
		for (String file : args) {
			System.out.println("Processing file " + file + "...");
			try {
				HyperXLSService hs = new HyperXLSService();
				hs.processXLSDelibereCC(file);
			}catch(ODFNotOfficeXmlFileException e){
				try {
					HyperODSService hs = new HyperODSService();
					hs.processODS(file);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
