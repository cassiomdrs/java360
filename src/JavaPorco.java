import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class JavaPorco extends Animal {
    public JavaPorco(String nome, String tocarSom, String comer) {
        super(nome, tocarSom, comer);
    }

    @Override
    public void arquivoSom() {
        try {
            File arquivo = new File("src/javaporco.wav");

            AudioInputStream audio =
                    AudioSystem.getAudioInputStream(arquivo);

            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            IO.println("Java Porco grunindo...");

            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);

            clip.close();
            audio.close();

        } catch (Exception e) {
            IO.println("Erro ao reproduzir áudio: " + e);
        }
    }

    @Override
    public void comer() {
        IO.println("O Java Porco " + getNome() + " come " + getComer() + "\n");
    }
}