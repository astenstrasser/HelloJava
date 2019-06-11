package br.com.cursoalura.javaIO.usingJavaIO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UnicodeAndEncoding {

	public static void main(String[] args) throws IOException {
		String s = "ç";
        System.out.println(s.codePointAt(0));
        
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());
        
        byte[] bytes = s.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");
        String sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);

        
        bytes = s.getBytes("UTF-16");
        System.out.println(bytes.length + ", UTF-16");
        sNovo = new String(bytes, "UTF-16");
        System.out.println(sNovo);


        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US_ASCII");
        sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);


	}

}
