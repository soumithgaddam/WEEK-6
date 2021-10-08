package Wallet.state;

public class TornState implements State {

    Wallet wallet;
    public TornState(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void makeWallet() {
        System.out.println("Buying wallet");
        wallet.setState(wallet.getMakeState());
    }

    @Override
    public void useWallet() {
        System.out.println("Wallets are used to protect and comfort the human foot");
    }

    @Override
    public void washWallet() {
        System.out.println("Wallet broken, can not be cleaned");

    }

    @Override
    public void tornWallet() {
        System.out.println("Soap broke");

    }


}
