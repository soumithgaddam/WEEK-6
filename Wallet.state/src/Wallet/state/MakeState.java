package Wallet.state;

public class MakeState implements State {

    Wallet wallet;
    public MakeState(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void makeWallet() {
        System.out.println("Wallets are produdes from leather");

    }

    @Override
    public void useWallet() {
        System.out.println("Wallets used to keep money and cards");
        wallet.setState(wallet.getUseState());

    }

    @Override
    public void washWallet() {
        System.out.println("cleaning Wallet");
        wallet.setState(wallet.getWashState());
    }

    @Override
    public void tornWallet() {
        System.out.println("Wallet is torned near foldings");
        wallet.setState(wallet.getTornState());
    }

}