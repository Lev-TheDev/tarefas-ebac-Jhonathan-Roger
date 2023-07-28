package adapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class GoogleDriveAdapter implements PersistenciaArquivos {
    private GoogleDrive googleDrive;

    public GoogleDriveAdapter(GoogleDrive googledrive) {
        this.googleDrive = googledrive;
    }


    @Override
    public void gravar(File file) {
        try {
            byte[] bytes = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        googleDrive.send(file.getAbsolutePath());
    }

    @Override
    public File ler(String caminho) {
        GoogleDriveFile file = googleDrive.send(caminho);
        return new File(file.getLocalPath());
    }
}
