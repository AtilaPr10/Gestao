/**
 * 
 */
package com.algaworks.comercial.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
//import com.algaworks.comercial.model.Projeto;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author atila
 *
 */
public class GeraPdf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private Projeto projeto;
	
	/*
	public GeraPdf(Projeto projeto){
		
		this.projeto = projeto;
		
	}
	
	*/
	
	
	public void gerarPdf(){
		
		Document documento = new Document();
		
		//Font azul = FontFactory.getFont(FontFactory.HELVETICA, Font.DEFAULTSIZE, Font.BOLD, new BaseColor(BaseColor.BLUE.getRGB()));
		
		 try {
			 
			 PdfWriter.getInstance(documento, new FileOutputStream("/home/atila/formulario.pdf"));
			 documento.open();
			 Paragraph texto = new Paragraph();
			 Image figura = Image.getInstance("/home/atila/Imagens/logocm.png");
			 figura.setAlignment(Image.LEFT | Image.TEXTWRAP);
			 documento.add(figura);
			 documento.add(new Paragraph("Relatorio visita de implantação SysPDV"));
			 
			// documento.addKeywords(projeto.getNome_cliente());
			 
			 
			 texto.add("\n");
			 texto.add("\n");texto.add("\n");texto.add("\n");texto.add("\n");texto.add("\n");texto.add("\n");
			 texto.add("Cliente");
			 texto.add("\n");
			 //texto.add(projeto.getNome_cliente());
			 texto.add("\n");
			 texto.add("_________________________________________________________________");
			 texto.add("\n");
			 texto.add("Codigo da Visita");
			 texto.add("\n");
			// texto.add(projeto.getCodigo());
			 texto.add("\n");
			 texto.add("_________________________________________________________________");
			 texto.add("\n");
			 texto.add("Modulos");
			 texto.add("\n");
			// texto.add(projeto.getModulos());
			 texto.add("_________________________________________________________________");
			 texto.add("\n");
			 texto.add("Horas");
			 texto.add("\n");
			// texto.add(projeto.getQtd_horas());
			 texto.add("\n");
			 texto.add("_________________________________________________________________");
			 texto.add("\n");
			 texto.add("Participantes");
			 texto.add("\n");
			// texto.add(projeto.getParticipantes());
			 texto.add("\n");
			 texto.add("_________________________________________________________________");
			 texto.add("\n");
			 texto.add("Observação");
			 texto.add("\n");
			// texto.add(projeto.getObservacao());
			 texto.add("\n");
			 texto.add("_________________________________________________________________");
			 
			 //Adciona o texto ao documento
			 documento.add(texto);
		
	
		 
		 } catch(DocumentException de) 
		 { 
			   System.err.println(de.getMessage()); 
	     } 
		       catch(IOException ioe) 
		 { 
			   System.err.println(ioe.getMessage()); 
		 } 
		 
		 
		    //Fecha o documento
		     documento.close();

			
		
	}
	

}
