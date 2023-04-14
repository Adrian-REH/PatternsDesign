package com.patronesdisenio.estructura.facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("Comienzo la conversion de video");

        VideoFile file= new VideoFile(fileName);
        Codec sourceCodec= CodecFactory.extract(file);
        Codec destCodec;


        if (format.equals("mp4")) {

            destCodec= new OggCompressionCodec();

        }else{
            destCodec= new MPEG4CompressionCodec();
        }

        VideoFile buffer= BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult= BitrateReader.converter(buffer, destCodec);

        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("Ya he terminado la conversion de video");

        return result;
    }



}
