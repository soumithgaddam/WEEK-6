package Wallet.state;

public class Main {

    public static void main(String[] args) {

        WalletBuilder Builders=new WalletBuilder();
        Wallet Wallets=Builders.tanning().stitching().polishing().build();
        Wallets.makeWallet();
        Wallets.tornWallet();
        Wallets.washWallet();
        Wallets.useWallet();
        Wallets.makeWallet();


    }

}

