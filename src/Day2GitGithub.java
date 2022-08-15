public class Day2GitGithub {
   /*
1-) git init --> Local repo oluşturmak için yani .git ile klasörümüzün
içindeki dosyaları ilişkilendirmek için kullanılır
2-) git add . --> Working space'den (yani yerel) dosyalarımı staging area'ya
(yani commitlemek için beklenen yer) gönderir

3-) git status---> working space deki ve staging area daki durumu gosterir
4-) git commit -m "mesaj" --> Staging area'dan commit stora
dosyalarımı göndermek için kullanılır (commit yani versiyon
yani sürüm oluşturmuş olurum)
5-) git push --> Uzak repo'ya(yani remote - Github)
göndermek için kullandığımız kod Yalnız git push komutunu direk kullanmak istersek 1 kez
            git remote add origin adres
            git push -u origin master
Not: Yukarıdaki iki komutu tek seferde kullandıktan sonra ikinci commit'lerim için sadece git push
kullanırız
 */

    /*

--------Komutlar
git --version
git config --global user.email "email_adresiniz"
git config --global user.name "isminiz"
git config --global -l --> Ayarları listeler
git init --> git ile ilişkilendirir
git status --> Working Space ve Staged deki değişiklikleri gösterir
git add . --> Working'den staging area'ya gönderir
git status
git diff --> Working space deki değişikliği gösterir
git diff --staged --> Staging Area daki değişiklikleri gösterir
git commit -m "first commit"
git show "hashcode" --> Versiyondaki değişiklikleri gösterir
git log --oneline
git remote add origin https://github.com/techproed2020/Git_...
git push -u origin master

 Not: git log --oneline----> commitlerimdeki yani versiyonlarımdaki durumu gosterir.
 
 Not: Github ogreniyorum


     */
    public static void main(String[] args) {
        System.out.println("Github ogreniyorum");
    }

}
