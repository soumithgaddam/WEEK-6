package Wallet.state;


public class WashState implements State {

    Wallet wallet;
    public WashState(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void makeWallet() {
        System.out.println("Wallet already brought");
        wallet.setState(wallet.getMakeState());
    }

    @Override
    public void useWallet() {
        System.out.println("Wallets are used to protect and comfort the human foot");
        wallet.setState(wallet.getUseState());
    }

    @Override
    public void washWallet() {
        System.out.println("Wallet broken, We can not use it");
    }

    @Override
    public void tornWallet() {
        System.out.println("wallet broke");
        wallet.setState(wallet.getTornState());
    }

    public String toString() {
        return "Wallet Cleaning";
    }

}