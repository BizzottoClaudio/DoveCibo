package restaurants;

/**
 * Crea il QR di ogni ristoranti
 *
 * @author IO-PC
 */
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QR_generator {
    Restaurant rest;

    /**
     * Costruttore QR code
     *
     * @param rest nome ristorante
     */
    public QR_generator(Restaurant rest) {
        this.rest = rest;
    }

    /**
     * Ritorna QR code generato
     *
     * @return stringa del QR code
     */
    public String qr_Gen() {
        String qrText = rest.RestDescriptionToText();

        //stringa che il QR mostrerà
        String dataToQR = qrText;

        ByteArrayOutputStream out = QRCode.from(dataToQR).to(ImageType.PNG).stream();
        Base64.Encoder encoder = Base64.getEncoder();
        String qrCode = encoder.encodeToString(out.toByteArray());

        return qrCode;
    }
}
