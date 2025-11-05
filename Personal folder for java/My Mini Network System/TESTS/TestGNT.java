import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestGNT {

    @Test
    void testToAddContactToTheFile(){
        GNet net = new GNet("GNet Company");

        PhoneBooks.unlockPhoneBooks();
        PhoneBooks.createABook("SamuelEjiofor","22");
        net.registerContact("SamuelEjiofor");
        PhoneBooks.createABook("Emmanuel","1111");
        net.registerContact("Emmanuel");
        PhoneBooks.lockPhoneBooks();
    }
    @Test
    void testToDeliverAMessage(){
        GNet net = new GNet("GNet Company");
        net.sendMessage("Emmanuel","0808618684","0809514982","the last message before i sleep i love u very much");

    }
}
