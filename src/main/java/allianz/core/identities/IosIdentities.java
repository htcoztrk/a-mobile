package allianz.core.identities;

import org.openqa.selenium.By;

import java.util.HashMap;

public class IosIdentities {

    private static HashMap<String, By> iosIdentities;

    private IosIdentities() {
    }

    public static HashMap<String, By> getIosIdentities() {

        if (iosIdentities == null)
            iosIdentities = new HashMap<>();
        if (iosIdentities.size() <= 0)
            initIosIdentities();
        return iosIdentities;
    }

    private static void addId(String key, By value) {
        iosIdentities.put(key, value);
    }

    private static void initIosIdentities() {

        addId("BİLDİRİMLERE İZİN VER", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]"));
        addId("KONUM ERİŞİMİNE İZİN VER", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]"));
        addId("UYGULAMAMIZA HOŞ GELDİNİZ DEVAM ET", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]"));
        addId("BENİ HATIRLA", By.xpath("//XCUIElementTypeStaticText[@name=\"Beni Hatırla\"]"));
        addId("UYGULAMAMIZA HOŞ GELDİNİZ DEVAM ET", By.xpath("//XCUIElementTypeButton[@name=\"Devam Et\"]"));
        addId("KLAVYE KAPATMA", By.id("Tamam"));
        addId("SAĞLIK CÜZDANI KAPAT", By.id("//XCUIElementTypeOther[@name=\"Home Grabber\"]"));
        addId("KARŞILAMA EKRANI GİRİŞ YAP", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]"));
        addId("TC KİMLİK NUMARASI", By.id("login_tckn_textfield"));
        addId("ŞİFRENİZ", By.id("login_password_textfield"));
        addId("KLAVYE KAPAT", By.id("Tamam"));
        addId("GİRİŞ EKRANI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("GİRİŞ YAP", By.id("login_login_button"));
        addId("AMBULANS ÇAĞIR", By.xpath("//XCUIElementTypeButton[contains(@name, 'Ambulans')]"));
        addId("DR ALLİANZ", By.xpath("//XCUIElementTypeStaticText[contains(@name, 'Allianz')]"));
        addId("DR ALLİANZ'I ARA", By.xpath("//XCUIElementTypeButton[contains(@name, 'ı Ara')]"));
        addId("MÜŞTERİ HİZMETLERİ", By.xpath("//XCUIElementTypeButton[contains(@name, 'Hizmetleri')]"));
        addId("ÇOCUĞUMUN SAĞLIĞI", By.id("Çocuğumun Sağlığı"));
        addId("YENİ ÇOCUK EKLE", By.id("Yeni Çocuk Ekle"));
        addId("ÇOCUĞUN ADI", By.xpath("(//XCUIElementTypeTextField)[1]"));
        addId("ÇOCUĞUN SOYADI", By.xpath("(//XCUIElementTypeTextField)[2]"));
        addId("ÇOCUĞUN DOĞUM TARİHİ", By.xpath("(//XCUIElementTypeTextField)[3]"));
        addId("ÇOCUK EKLE", By.id("Ekle"));
        addId("ANLAŞMALI SAĞLIK KURUMU BUL", By.id("Anlaşmalı Sağlık Kurumu Bul"));
        addId("KURUM/DOKTOR BUL", By.id("commission_searchbar"));
        addId("AMERİKAN HASTANESİ ADRES BİLGİSİ", By.xpath("//XCUIElementTypeStaticText[contains(@value, 'Teşvikiye')]"));
        addId("AMERİKAN HASTANESİ TELEFON BİLGİSİ", By.id("4443777"));
        addId("DENEME", By.xpath("//XCUIElementTypeStaticText[@name='Giriş Yap']"));
        addId("KULLANICI İZNİ ONAYLIYORUM BUTONU", By.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
        //addId("HOŞGELDİNİZ DEVAM ET BUTONU", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]"));

        //LOGİNSİZ
        addId("HASARIM VAR ALLİANZIM LOGİNSİZ", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        addId("ANLAŞMALI KURUM BUL LOGİNSİZ", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton"));
        addId("MÜŞTERİ HİZMETLERİ LOGİNSİZ", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeButton"));
        addId("AMBULANS ÇAĞIR LOGİNSİZ", By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        addId("ARAMA YAP LOGİNSİZ", By.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton"));
        addId("DR ALLİANZ LOGİNSİZ", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton"));
        addId("SAĞLIK HATTINI ARA LOGİNSİZ", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton"));
        addId("SAĞLIK KURUMU BUL LOGİNSİZ", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("SÜZGEÇ", By.xpath("//XCUIElementTypeButton[@name=\"filterIcon\"]"));
        addId("KURUM TİPİ SEÇİNİZ", By.xpath("//XCUIElementTypeTextField[@name=\"commission_policy_textfield\"]"));
        addId("KURUM TİPİ HASTANE", By.id("Tamam"));
        addId("KAPSAM SEÇİNİZ", By.xpath("//XCUIElementTypeTextField[@name=\"commission_product_textfield\"]"));
        addId("KAPSAM TÜM ANLAŞMALI KURUMLAR", By.id("Tamam"));
        addId("İL SEÇİNİZ", By.xpath("//XCUIElementTypeTextField[@name=\"commission_network_textfield\"]"));
        addId("BRANŞ TİPİ SEÇİNİZ", By.xpath("//XCUIElementTypeTextField[@name=\"commission_institution_textfield\"]"));
        addId("BRANŞ TİPİ ACİL TIP", By.id("Tamam"));
        addId("İL ADANA", By.id("Tamam"));
        addId("SAĞLIK KURUMU BUL FİLTRE UYGULA LOGİNSİZ", By.xpath("//XCUIElementTypeButton[@name=\"commission_search_button\"]"));
        addId("SAĞLIK KURUMU LİSTE", By.xpath("//XCUIElementTypeButton[@name=\"Liste\"]"));
        addId("SAĞLIK KURUMU", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
        addId("SAĞLIK KURUMU TELEFON", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("RANDEVU AL LOGİNSİZ", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeButton"));

        //Allianzım
        addId("HASARIM VAR MYALLİANZ", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        addId("AMBULANSI ARA", By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        addId("ARAMA YAP", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther"));
        addId("ARAMA ALANI", By.xpath("//XCUIElementTypeSheet"));
        addId("SAĞLIK HATTINI ARA", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]"));
        addId("DR ALLİANZ'LA GÖRÜŞ", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]"));
        addId("DR ALLİANZ'I ARA", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]"));
        addId("MÜŞTERİ HİZMETLERİ", By.xpath("XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton"));
        addId("ANLAŞMALI KURUM BUL", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton"));
        addId("SAĞLIK KURUMU BUL", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("KURUM/DOKTOR BUL", By.xpath("//XCUIElementTypeNavigationBar[@name=\"InstitutionAndDoctorFinderView\"]"));
        addId("LİSTEDEKİ İLK HASTANE", By.xpath("//XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("AMERİKAN HASTANESİ ADRES BİLGİSİ", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("AMERİKAN HASTANESİ TELEFON BİLGİSİ", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("RANDEVU AL", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeButton"));
        addId("GÖRÜNTÜLÜ GÖRÜŞME BAŞLAT", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]"));
        addId("HABERLER", By.xpath("//XCUIElementTypeImage[@name=\"newsBottomIcon\"]"));
        addId("HABERLER BAŞLIĞI", By.xpath("//XCUIElementTypeStaticText[@name=\"navigationbar_title_label\"]"));
        addId("İLETİŞİM FORMU", By.xpath("//XCUIElementTypeStaticText[@name=\"İletişim Formu\"]"));
        addId("TERCİH EDİLEN İLETİŞİM KANALI", By.id("txt_select_contact_channels"));
        addId("TERCİH EDİLEN İLETİŞİM KANALI SEÇİMİ", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("İLETİŞİM FORMU KONU", By.id("txt_select_subjects"));
        addId("İLETİŞİM FORMU KONU LİSTESİNİN İLK ELEMANI", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("İLETİŞİM FORMU AÇIKLAMA", By.id("txt_description"));
        addId("İLETİŞİM FORMU GÖNDER BUTONU", By.id("action_send"));
        addId("İLETİŞİM FORMU BAŞARILI POP UP", By.xpath("//XCUIElementTypeAlert[@name=\"Bilgi\"]"));
        addId("AYARLAR", By.xpath("//XCUIElementTypeStaticText[@name=\"Ayarlar\"]"));
        addId("UYGULAMA DİLİNİ DEĞİŞTİR", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("ENGLISH", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("TAMAM DİL DEĞİŞTİR", By.xpath("//XCUIElementTypeButton[@name=\"login_login_button\"]"));
        addId("ÇIKIŞ YAP", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("KAMPANYALAR", By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton"));
        addId("KAMPANYALAR ALANI", By.xpath("//XCUIElementTypeOther[5]/XCUIElementTypeOther"));
        addId("KİŞİ İKONU", By.xpath("//XCUIElementTypeStaticText[@name=\"Resim Yükle\"]"));
        addId("VAR OLAN FOTOĞRAFI SEÇ", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]"));
        addId("GALERİ TAMAM", By.xpath("//XCUIElementTypeStaticText[@name=\"Seç\"]"));
        addId("FOTOĞRAF SİL", By.xpath("//XCUIElementTypeButton[@name=\"Fotoğrafı Sil\"]"));
        addId("GECİKMİŞ ÖDEMELER", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        addId("GECİKMİŞ ÖDEMELER SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("HASARIM VAR SAYFASI İÇERİĞİ", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]"));
        addId("HIZLI İŞLEMLER", By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]"));
        addId("POLİÇE SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("ŞİFRE DEĞİŞTİR", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]"));
        addId("ESKİ ŞİFRE", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField"));
        addId("YENİ ŞİFRE", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField"));
        addId("YENİ ŞİFRE TEKRARI", By.xpath("//XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField"));
        addId("ŞİFRE DEĞİŞTİR BUTONU", By.xpath("//XCUIElementTypeOther[1]/XCUIElementTypeButton[2]"));
        addId("ŞİFRE DEĞİŞTİR BAŞARILI POP UP BAŞLIĞI", By.xpath("//XCUIElementTypeStaticText[@name=\"Şifreniz Değiştirildi\"]"));
        addId("ŞİFRE DEĞİŞTİR POP UP TAMAM", By.id("login_login_button"));

        //Birikimlerim - Ortak

        addId("BİRİKİMLERİM TABI", By.xpath("//XCUIElementTypeButton[@name=\"Birikimlerim\"]"));
        addId("GECMİS POLİCELERİM", By.id("Geçmiş Poliçelerim"));
        addId("GECMİS POLİCELERİM SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView"));
        addId("TALEBİNİZ İŞLEME ALINMIŞTIR", By.id("Talebiniz işleme alınmıştır."));
        addId("ÇARPI BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"X\"]"));
        addId("İŞLEM ONAY", By.xpath("//XCUIElementTypeStaticText[@name=\"İşlem Onay\"]"));
        addId("BİTTİ BUTONU", By.id("Done"));

        //Birikimlerim - AZYE

        addId("ALLİANZ YAŞAM EMEKLİLİK İLK POLİÇE/SÖZLEŞMEYE", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK POLİÇE/SÖZLEŞMELER SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable\n"));
        addId("ALLİANZ YAŞAM EMEKLİLİK BİRİKİM DETAYIM TABI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK BİRİKİM DETAYIM SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEMELERİM TABI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FONLARIM", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEMELERİM SAYFASI", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FONLARIM SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("ALLİANZ YAŞAM EMEKLİLİK TOPLAM BİRİKİMİM", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[16]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK TOPLAM BİRKİMİM SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("ALLİANZ YAŞAM EMEKLİLİK TAHMİNİ BİRİKİMİM", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[17]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK TAHMİNİ BİRKİMİM SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("ALLİANZ YAŞAM EMEKLİLİK EK FAYDALAR", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[18]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK EK FAYDALAR SAYFASI", By.xpath("//XCUIElementTypeOther[@name=\"additional_benefit_view\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK DEVLET KATKISI ARTTIR SAYFASI", By.xpath(""));
        addId("ALLİANZ YAŞAM EMEKLİLİK DEVLET KATKISI ARTTIR", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[13]"));
        addId("ALLİANZ EMEKLİLİK DÜNYASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[7]"));
        addId("ALLİANZ EMEKLİLİK DÜNYASI SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));

        addId("ALLİANZ YAŞAM EMEKLİLİK KATKI PAYI TUTARI KALEM İKONU", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[4]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK KATKI PAYI TUTARI", By.xpath("//XCUIElementTypeTextField"));
        addId("ALLİANZ YAŞAM EMEKLİLİK KATKI PAYI TUTARI GÜNCELLE BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Güncelle\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK KATKI PAYI TUTARI GÖNDER BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Gönder\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK KATKI PAYI ŞİFRE", By.xpath("//XCUIElementTypeSecureTextField"));
        addId("ALLİANZ YAŞAM EMEKLİLİK KATKI PAYI TUTARI TAMAM BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));

        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ KALEM İKONU", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[7]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ ALANI",By.xpath("//XCUIElementTypeTextField"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ TARİH SEÇİMİ", By.xpath("//XCUIElementTypePicker/XCUIElementTypePickerWheel[1]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ TAMAM BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ GÜNCELLE BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Güncelle\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ GÖNDER BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Gönder\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ ŞİFRE", By.xpath("//XCUIElementTypeSecureTextField"));

        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMINI DEĞİŞTİR BUTONU",By.xpath("//XCUIElementTypeButton[@name=\"Fon Dağılımını Değiştir\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMI DEĞİŞİKLİĞİ YAP BUTONU",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeButton"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMINDAN ÇIKIŞ ONAY", By.xpath("(//XCUIElementTypeButton[@name=\"login_login_button\"])[1]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON PAKETLERİNİ İNCELE BUTONU",By.id("buttonReviewFundPackages"));
        addId("ALLİANZ YAŞAM EMEKLİLİK BU PAKETLE DEVAM ET",By.xpath("//XCUIElementTypeButton[@name=\"Bu Paketle Devam Et\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK BİRİNCİ FON",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField"));
        addId("ALLİANZ YAŞAM EMEKLİLİK İKİNCİ FON",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeTextField"));
        addId("ALLİANZ YAŞAM EMEKLİLİK ÜÇÜNCÜ FON",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeTextField"));
        addId("ALLİANZ YAŞAM EMEKLİLİK DÖRDÜNCÜ FON",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeTextField"));
        addId("ALLİANZ YAŞAM EMEKLİLİK KATKI PAYLARIM CHECKBOX",By.xpath("//XCUIElementTypeStaticText[@name=\"Katkı Paylarım\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK BİRİKİMİM CHECKBOX",By.xpath("//XCUIElementTypeStaticText[@name=\"Birikimim\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMI GÖNDER BUTONU",By.xpath("//XCUIElementTypeButton[@name=\"Gönder\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMI SMS GÖNDER BUTONU",By.xpath("//XCUIElementTypeButton[@name=\"Gönder\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMI SERBEST DAĞILIM UYARISI EVET BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Evet\"]"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMI SMS GÖNDER BUTONU", By.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMI SMS ŞİFRE", By.xpath("//XCUIElementTypeSecureTextField"));
        addId("ALLİANZ YAŞAM EMEKLİLİK FON DAĞILIMI SMS TAMAM", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));

        addId("AKILLI BES PROGRAMI",By.id("AkıllıBES Programı"));
        addId("AKILLI BES'E KATIL BUTONU",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeButton"));
        addId("AKILLI BES KVKK AYDINLATMA CHECKBOX",By.id("contributionAmountCheckBoxOffI"));
        addId("AKILLI BES'E KATIL", By.xpath("//XCUIElementTypeButton[@name=\"AkıllıBES’e Katıl\"]"));
        addId("DOĞUM YILINIZ",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField"));
        addId("MEDENİ DURUMUNUZ",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField"));
        addId("ÇOCUK SAYISI",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField"));
        addId("KİRA DURUMUNUZ",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeTextField"));
        addId("ÇALIŞMA DURUMUNUZ",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeTextField"));
        addId("BİREYSEL KREDİ DURUMUNUZ",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeTextField"));
        addId("YATIRIMCI PROFİLİ SORU SEÇENEĞİ",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]"));
        addId("FON DAĞILIMI DEĞİŞİKLİK TİPİ", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeTextField"));
        addId("AKILLI BES PROGRAMI İŞLEM ONAYI", By.xpath("//XCUIElementTypeStaticText[@name=\"İşleminiz başarıyla gerçekleştirildi.\"]"));

        addId("AKILLI BES ÜYESİ OLMAK İSTER MİSİN BİLGİ AL", By.xpath("//XCUIElementTypeButton[@name=\"Bilgi Al\"]"));





        //Birikimlerim - AZHE

        addId("ALLİANZ HAYAT EMEKLİLİK İLK POLİÇE/SÖZLEŞMEYE", By.xpath("//XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]"));
        addId("ALLİANZ HAYAT EMEKLİLİK POLİÇE/SÖZLEŞMELER SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("ALLİANZ HAYAT EMEKLİLİK BİRİKİM DETAYIM TABI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]"));
        addId("ALLİANZ HAYAT EMEKLİLİK BİRİKİM DETAYIM SAYFASI", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEMELERİM TABI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEMELERİM SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("ALLİANZ HAYAT EMEKLİLİK FONLARIM", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]"));
        addId("ALLİANZ HAYAT EMEKLİLİK FONLARIM SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("ALLİANZ HAYAT EMEKLİLİK TOPLAM BİRİKİMİM", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[13]"));
        addId("ALLİANZ HAYAT EMEKLİLİK TOPLAM BİRKİMİM SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("ALLİANZ HAYAT EMEKLİLİK TAHMİNİ BİRİKİMİM", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[14]"));
        addId("ALLİANZ HAYAT EMEKLİLİK TAHMİNİ BİRİKİMİM SAYFASI", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));

        addId("ALLİANZ HAYAT EMEKLİLİK EK FAYDALAR", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[15]"));
        addId("ALLİANZ HAYAT EMEKLİLİK EK FAYDALAR SAYFASI", By.xpath("//XCUIElementTypeOther[@name=\"additional_benefit_view\"]"));

        addId("ALLİANZ HAYAT EMEKLİLİK KATKI PAYI TUTARI KALEM İKONU", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]"));
        addId("ALLİANZ HAYAT EMEKLİLİK KATKI PAYI TUTARI", By.xpath("//XCUIElementTypeTextField"));
        addId("ALLİANZ HAYAT EMEKLİLİK KATKI PAYI TUTARI GÜNCELLE BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Güncelle\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK KATKI PAYI TUTARI GÖNDER BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Gönder\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK KATKI PAYI ŞİFRE", By.xpath("//XCUIElementTypeSecureTextField"));
        addId("ALLİANZ HAYAT EMEKLİLİK KATKI PAYI TUTARI TAMAM BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));

        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ KALEM İKONU", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[6]"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ ALANI",By.xpath("//XCUIElementTypeTextField"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ TARİH SEÇİMİ", By.xpath("//XCUIElementTypePicker/XCUIElementTypePickerWheel[1]"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ TAMAM BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ GÜNCELLE BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Güncelle\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ GÖNDER BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Gönder\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÖDEME PERİYODU VE GÜNÜ ŞİFRE", By.xpath("//XCUIElementTypeSecureTextField"));

        addId("ALLİANZ HAYAT EMEKLİLİK FON DAĞILIMINI DEĞİŞTİR BUTONU",By.xpath("//XCUIElementTypeButton[@name=\"Fon Dağılımını Değiştir\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK FON DAĞILIMINDAN ÇIKIŞ ONAY", By.xpath("(//XCUIElementTypeButton[@name=\"login_login_button\"])[1]"));
        addId("ALLİANZ HAYAT EMEKLİLİK FON PAKETLERİNİ İNCELE BUTONU",By.id("buttonReviewFundPackages"));
        addId("ALLİANZ HAYAT EMEKLİLİK BU PAKETLE DEVAM ET",By.xpath("//XCUIElementTypeButton[@name=\"Bu Paketle Devam Et\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK BİRİNCİ FON",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField"));
        addId("ALLİANZ HAYAT EMEKLİLİK İKİNCİ FON",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeTextField"));
        addId("ALLİANZ HAYAT EMEKLİLİK ÜÇÜNCÜ FON",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeTextField"));
        addId("ALLİANZ HAYAT EMEKLİLİK DÖRDÜNCÜ FON",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeTextField"));
        addId("ALLİANZ HAYAT EMEKLİLİK KATKI PAYLARIM CHECKBOX",By.xpath("//XCUIElementTypeStaticText[@name=\"Katkı Paylarım\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK BİRİKİMİM CHECKBOX",By.xpath("//XCUIElementTypeStaticText[@name=\"Birikimim\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK FON DAĞILIMI GÖNDER BUTONU",By.xpath("//XCUIElementTypeButton[@name=\"Gönder\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK FON DAĞILIMI SMS GÖNDER BUTONU",By.xpath("//XCUIElementTypeButton[@name=\"Gönder\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK FON DAĞILIMI SERBEST DAĞILIM UYARISI EVET BUTONU", By.xpath("//XCUIElementTypeButton[@name=\"Evet\"]"));
        addId("ALLİANZ HAYAT EMEKLİLİK FON DAĞILIMI SMS GÖNDER BUTONU", By.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
        addId("ALLİANZ HAYAT EMEKLİLİK FON DAĞILIMI SMS ŞİFRE", By.xpath("//XCUIElementTypeSecureTextField"));
        addId("ALLİANZ HAYAT EMEKLİLİK FON DAĞILIMI SMS TAMAM", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));



        ////Sağlığım
        addId("SAĞLIĞIM TABI", By.id("Sağlığım"));
        addId("AKTİF POLİÇE", By.xpath("//XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]"));
        addId("KALAN LİMİT BİLGİSİ", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[14]"));
        addId("KALAN LİMİT BİLGİSİ SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView"));
        addId("POLİÇEYİ PDF OLARAK GÖRÜNTÜLE", By.id("Poliçeyi PDF Olarak Görüntüle"));
        addId("POLİÇE NO", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("GEÇMİŞ POLİÇELERİM", By.xpath("//XCUIElementTypeStaticText[@name=\"Geçmiş Poliçelerim\"]"));
        addId("GEÇMİŞ SAĞLIK POLİÇESİ SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView"));
        addId("SAĞLIK CÜZDANIM", By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[4]"));
        addId("SIKÇA SORULAN SORULAR", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        addId("SIKÇA SORULAN SORULAR METNİ", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("SAĞLIK CÜZDANIM SAYFASI", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("ARACI", By.xpath("//XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("ARACI NUMARASI", By.id("agency_location_button"));
        addId("MAKBUZU GORUNTULE", By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[16]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("MAKBUZU GORUNTULE SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("ÖDENMİŞ İLK TAKSİT MAKBUZU GÖRÜNTÜLE BUTONU", By.xpath("//XCUIElementTypeCell/XCUIElementTypeButton[1]"));
        addId("MAKBUZ İÇERİĞİ", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeWebView"));
        addId("POLİÇENİZE ÖZEL HİZMETLER", By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[12]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("POLİÇENİZE ÖZEL HİZMETLER SAYFASI", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("WALLET UYGULAMASINA AKTAR", By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("SAĞLIK HARCAMASI TALEBİ", By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[13]"));
        addId("BELGELERİ YÜKLE", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("FOTOĞRAF", By.xpath("(//XCUIElementTypeImage)[2]"));
        addId("FOTOĞRAF TAMAM", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("FATURA SAHİBİ", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField"));
        addId("FATURA SAHİBİ SEÇİMİ", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("SAĞLIK HARCAMA TALEBİ DEVAM", By.xpath("//XCUIElementTypeButton[@name=\"Devam\"]"));
        addId("SAĞLIK HARCAMA TALEBİ FATURA TARİHİ", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField"));
        addId("SAĞLIK HARCAMA TALEBİ FATURA TARİHİ SEÇİMİ", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("SAĞLIK HARCAMA TALEBİ HİZMET TARİHİ", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField\n"));
        addId("SAĞLIK HARCAMA TALEBİ HİZMET TARİHİ SEÇİMİ", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("FATURA NUMARASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField"));
        addId("FATURA TUTARI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeTextField"));
        addId("DOKTOR MUAYENESİ Mİ", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTextField"));
        addId("DOKTOR MUAYENESİ Mİ EVET", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("DOKTOR BRANŞI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeTextField"));
        addId("DOKTOR BRANŞI SEÇ", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("SAĞLIK HARCAMASI DOSYANIZ AÇILDI", By.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]"));


        //OTHER
        addId("DİĞER TABI", By.xpath("//XCUIElementTypeButton[@name=\"Diğer\"]"));
        addId("KONUT POLİÇESİ", By.id("Konut"));
        addId("MAKBUZU GÖRÜNTÜLE", By.id("Makbuz Görüntüle"));
        addId("MAKBUZU GÖRÜNTÜLE BUTONU", By.xpath("(//XCUIElementTypeButton[@name=\"Makbuzu Görüntüle\"])[1]"));
        addId("EN ÜSTTEKİ GEÇMİŞ POLİÇE", By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]"));
        addId("POLİÇENİZİN SÜRESİ DOLMUŞTUR", By.xpath("//XCUIElementTypeStaticText[@name=\"Poliçenizin süresi dolmuştur.\"]"));
        addId("DASK POLİÇESİ", By.id("Dask"));
        addId("MAKBUZU GÖRÜNTÜLE DASK", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        addId("MAKBUZU GÖRÜNTÜLE DASK SAYFASI", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable"));
        addId("HASAR DOSYASI OLUŞTURMA", By.xpath("//XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[6]/XCUIElementTypeOther/XCUIElementTypeOther"));
        addId("YANGIN", By.xpath("(//XCUIElementTypeStaticText[@name=\"Yangın\"])[1]"));
        addId("POLİÇE SEÇİMİ", By.xpath("//XCUIElementTypeOther[@name=\"FNOL | Allianz\"]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]"));
        addId("POLİÇE SEÇİMİ İLK", By.xpath("//XCUIElementTypeOther[@name=\"FNOL | Allianz\"]/XCUIElementTypeOther[9]/XCUIElementTypeOther[2]"));
        addId("İLERİ HASAR OLUŞTURMA", By.xpath("(//XCUIElementTypeButton[@name=\"İleri\"])[2]"));
        addId("DAHİLİ SU", By.xpath("//XCUIElementTypeOther[@name=\"FNOL | Allianz\"]/XCUIElementTypeOther[10]/XCUIElementTypeOther[1]"));
        addId("TAKVİM", By.xpath("//XCUIElementTypeOther[@name=\"FNOL | Allianz\"]/XCUIElementTypeOther[22]"));
        addId("TARİH", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("İLERİ HASAR NEDENİ", By.xpath("(//XCUIElementTypeButton[@name=\"İleri\"])[3]"));
        addId("TAHMİNİ HASAR TUTARI", By.xpath("//XCUIElementTypeOther[@name=\"FNOL | Allianz\"]/XCUIElementTypeOther[25]"));
        addId("0-2000 TL", By.xpath("//XCUIElementTypeOther[@name=\"FNOL | Allianz\"]/XCUIElementTypeOther[25]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]\n"));
        addId("ONARIM TAMAMLANDI MI EVET", By.xpath("(//XCUIElementTypeOther[@name=\"icon_yes-default_en\"])[1]/XCUIElementTypeImage[2]"));
        addId("İLERİ HASAR NE ZAMAN", By.xpath("(//XCUIElementTypeButton[@name=\"İleri\"])[4]"));
        addId("İLERİ İLETİŞİM BİLGİLERİ", By.xpath("(//XCUIElementTypeButton[@name=\"İleri\"])[5]"));
        addId("YÜKLEMEK İÇİN TIKLAYIN", By.xpath("//XCUIElementTypeOther[@name=\"FNOL | Allianz\"]/XCUIElementTypeOther[14]/XCUIElementTypeOther"));
        addId("GALERİ FOTOĞRAFI", By.xpath("//XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]"));
        addId("GALERİ FOTOĞRAFI YÜKLE TAMAM", By.xpath("//XCUIElementTypeButton[@name=\"Seç\"]"));
        addId("İLERİ BELGE EKLEME", By.xpath("(//XCUIElementTypeButton[@name=\"İleri\"])[6]"));
        addId("ONAYLA", By.xpath("(//XCUIElementTypeButton[@name=\"Onayla\"])[7]"));
        addId("DEĞERLENDİRME ONAYLA", By.xpath("(//XCUIElementTypeStaticText[@name=\"ONAYLA\"])[8]"));
        addId("HASAR DOSYANIZ AÇILMIŞTIR", By.xpath("(//XCUIElementTypeStaticText[@name=\"Hasar Dosyanız Açılmıştır\"])[8]"));

        addId("HASAR İHBARI YAPACAĞIM BUTONU", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[4]"));
        addId("TESİSATA BAĞLI HASARLAR BUTONU", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]"));
        addId("ONARIM YAPILACAK BUTONU", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[4]"));
        addId("TAHMİNİ HASAR MALİYETİ", By.id("En yakın tutarı seçin"));
        addId("TAHMİNİ HASAR MALİYETİ TAMAM", By.id("Tamam"));
        addId("HASARINIZ NASIL OLUŞTU", By.xpath("//XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView"));
        addId("HASAR FOTOĞRAFLARI EKLEME BUTONU", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeImage[4]"));


        //ARABAM
        addId("AKTİF ARAÇ POLİÇESİ", By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]"));
        addId("TRAFİK POLİÇESİ DETAYLARI GÖSTER",By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell[3]"));
        addId("TRAFİK POLİÇESİ POLİÇE NO", By.xpath("(//XCUIElementTypeStaticText[@name=\"policy_detail_cell_value_label\"])[1]"));

        addId("GEÇMİŞ TRAFİK POLİÇESİ", By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]"));

        addId("ARABAM TABI", By.xpath("//XCUIElementTypeButton[@name='Arabam']"));
        addId("HASARIM VAR", By.xpath("//XCUIElementTypeStaticText[@name='Hasarım Var']"));
        addId("EN ÜSTTEKİ ARAÇ", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[6]"));

        addId("ÇEKİCİ ÇAĞIR", By.xpath("(//XCUIElementTypeStaticText[@name=\"Size nasıl yardımcı olabiliriz?\"])//..//..//XCUIElementTypeOther[2]//XCUIElementTypeButton"));
        addId("SERVİS SEÇ", By.xpath("//XCUIElementTypeButton[@name=\"Servis Seç\"]"));

        addId("KONUMU KULLAN İNAKTİF", By.xpath("//*[@text='']"));
        addId("BİR YER ARA", By.xpath("//*[@text='Bir Yer Ara']"));
        addId("KAZA TESPİT TUTANAĞI DOLDUR", By.xpath("//XCUIElementTypeStaticText[@name=\"Kaza tespit tutanağı doldur.\"]"));
        addId("KAZA TESPİT TUTANAĞI REHBERİ", By.xpath("//XCUIElementTypeStaticText[@name=\"Kaza Tespit Tutanağı Rehberi\"]"));
        addId("KAZA TESPİT TUTANAĞI GÖRÜNTÜLE", By.xpath("//XCUIElementTypeStaticText[@name=\"Kaza Tespit\"]"));
        addId("KAZA TESPİT TUTANAĞI", By.id("QLPreviewControllerView"));
        addId("MOBİL KAZA TESPİT TUTANAĞI İNDİR", By.xpath("//XCUIElementTypeStaticText[@name=\"Mobil Kaza Tespit Tutanağı İndir\"]"));
        addId("MOBİL KAZA TUTANAĞI APP", By.xpath("//XCUIElementTypeStaticText[@name=\"Mobil Kaza Tutanağı\"]"));

        addId("ARAMA ÇUBUĞU", By.xpath("//XCUIElementTypeOther[@name=\"web sorgu kutusu\"]/XCUIElementTypeSearchField"));
        addId("FYN OTOMOTİV", By.xpath("//XCUIElementTypeStaticText[@name='Fyn Otomotiv Kiralama İnş Gıda Tur Tic Ltd Şti']"));
        addId("FYN OTOMOTİV SERVİS BİLGİLERİ", By.xpath("(//XCUIElementTypeStaticText[@name=\"Fyn Otomotiv Kiralama İnş Gıda Tur Tic Ltd Şti\"])[1]"));
        addId("ÇEKİCİ TALEBİNİZ ALINDI", By.xpath("//XCUIElementTypeStaticText[@name='Çekici talebiniz alındı.']"));


        addId("SERVİS KONUM ARAMA SONUCU", By.xpath("//XCUIElementTypeOther[@name=\"web sorgu kutusu\"]/XCUIElementTypeImage[2]"));
        addId("DİĞER SERVİSLERDEN EN YAKIN", By.xpath("//XCUIElementTypeStaticText[@name=\"En Yakın\"]"));
        addId("SERVİS BİLGİLERİ", By.xpath("//XCUIElementTypeStaticText[@name=\"En Yakın\"]"));
        addId("ADRES YAZ", By.xpath("//XCUIElementTypeButton[@name=\"Adres Yaz\"]"));
        addId("ÇEKİCİ İL SEÇ", By.xpath("//XCUIElementTypeStaticText[@name=\"İl Seçin\"]"));
        addId("ÇEKİCİ İL İLÇE TAMAM", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));
        addId("ÇEKİCİ İLÇE SEÇ", By.xpath("//XCUIElementTypeStaticText[@name=\"İlçe Seçin\"]"));
        addId("ADRES DETAYI", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView"));
        addId("ADRES KAYDET", By.xpath("//XCUIElementTypeButton[@name=\"Adresi Kaydet\"]"));

        addId("ONARIM İÇİN SERVİS BUL", By.xpath("(//XCUIElementTypeStaticText[@name=\"Size nasıl yardımcı olabiliriz?\"])//..//..//XCUIElementTypeOther[3]//XCUIElementTypeButton"));


        addId("HASAR İHBARI YAPACAĞIM", By.xpath("//XCUIElementTypeStaticText[@name=\"Hasar ihbarı yapacağım.\"]"));
        addId("PARK HALİNDE", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[3]//XCUIElementTypeButton"));
        addId("TAMİR EDİLECEK", By.xpath("(//XCUIElementTypeStaticText[@name=\"Aracınız ne durumda?\"])//..//..//XCUIElementTypeOther[4]//XCUIElementTypeButton"));
        addId("RUHSAT FOTOĞRAFI EKLEME", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]"));
        addId("FOTOĞRAF EKLEME DEVAM", By.xpath("//XCUIElementTypeStaticText[@name=\"Devam\"]"));
        addId("RUHSAT FOTOĞRAFI EKLE", By.xpath("//XCUIElementTypeStaticText[@name=\"Fotoğraf Ekle\"]"));
        addId("GALERİDEN SEÇ", By.xpath("//XCUIElementTypeButton[@name=\"Galeriden Seç\"]"));
        addId("RUHSAT FOTOĞRAFI", By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]"));
        addId("HASAR FOTOĞRAFI", By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]"));
        addId("FATURA FOTOĞRAFI", By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]"));
        addId("KARAKOL TUTANAĞI FOTOĞRAFI", By.xpath("//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]"));
        addId("GALERİDEN FOTOĞRAF EKLE", By.xpath("//XCUIElementTypeButton[@name=\"Ekle (1)\"]"));
        addId("DEVAM ET", By.xpath("//XCUIElementTypeButton[@name=\"Devam Et\"]"));
        addId("HASAR TARİHİ", By.xpath("//XCUIElementTypeStaticText[@name=\"Tarih seçin\"]"));

        addId("1 HAZİRAN 2021 TARİHİ", By.xpath("(//XCUIElementTypeButton[@name='1'])[9]"));
        addId("11 HAZİRAN 2021 TARİHİ", By.xpath("(//XCUIElementTypeButton[@name='11'])[1]"));
        addId("TARİH SEÇ", By.xpath("//XCUIElementTypeButton[@name=\"Seç\"]"));

        addId("HASAR YERİ SEÇ", By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[7]"));
        addId("BİR YER ARA", By.xpath("//XCUIElementTypeStaticText[@name=\"Bir yer ara\"]"));
        addId("ŞU ANKİ KONUMU KULLAN", By.xpath("//XCUIElementTypeStaticText[@name=\"Şu anki konumumu kullan\"]"));
        addId("HASAR İHBARI YAP SERVİS SEÇ", By.xpath("//XCUIElementTypeStaticText[@name=\"Servis Seç\"]"));
        addId("HASAR FOTOĞRAFI EKLE", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[4]"));

        addId("TAMİR EDİLDİ", By.xpath("(//XCUIElementTypeStaticText[@name=\"Aracınız ne durumda?\"])//..//..//XCUIElementTypeOther[5]//XCUIElementTypeButton"));

        addId("FATURA TARİHİ", By.xpath("(//XCUIElementTypeStaticText[@name=\"Fatura Tarihi\"])[2]"));
        addId("KDV DAHİL TOPLAM TUTAR", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]"));
        addId("TAMİRHANE TCKN", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]"));
        addId("IBAN", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[3]"));
        addId("FATURA FOTOĞRAFI EKLEME", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[4]"));
        addId("HASAR İHBARI YAP", By.xpath("//XCUIElementTypeButton[@name=\"Hasar İhbarı Yap\"]"));


        addId("BAŞKA BİR ARAÇLA", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[4]//XCUIElementTypeButton"));
        addId("SADECE KENDİ ARACIM", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[5]//XCUIElementTypeButton"));
        addId("HASAR İHBARINIZ ALINDI ONAYI", By.xpath("//XCUIElementTypeStaticText[@name='Hasar ihbarınız alındı.']"));
        addId("DAHA FAZLA HASAR ÇEŞİDİ", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[9]//XCUIElementTypeButton"));
        addId("CAM KIRILMASI", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[7]//XCUIElementTypeButton"));
        addId("ARAÇ ÇALINMA", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[8]//XCUIElementTypeButton"));

        addId("LASTİK HASARLARI", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[8]//XCUIElementTypeButton"));
        addId("ANAHTAR KAYBI HASARI", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[10]//XCUIElementTypeButton"));
        addId("SEYİR HALİNDE HASAR", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[11]//XCUIElementTypeButton"));
        addId("DİĞER HIRSIZLIK - HIRSIZLIĞA BAĞLI HASARLAR", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[14]//XCUIElementTypeButton"));
        addId("ŞİDDET İÇERİKLİ HASARLAR / TERÖR FAALİYETLERİ", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[15]//XCUIElementTypeButton"));
        addId("DOLU", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[17]//XCUIElementTypeButton"));
        addId("SEL/SU", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[18]//XCUIElementTypeButton"));
        addId("DİĞER HAVA ŞARTLARI", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[19]//XCUIElementTypeButton"));
        addId("YABANİ HAYVANLAR", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[21]//XCUIElementTypeButton"));
        addId("DİĞER HASARLAR", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[22]//XCUIElementTypeButton"));
        addId("CAM KIRILMASI ONARIM İÇİN SERVİS BUL", By.xpath("//XCUIElementTypeButton[@name=\"Onarım İçin Servis Bul\"]"));
        addId("HASAR İHBARINA DEVAM ET", By.xpath("//XCUIElementTypeButton[@name=\"Hasar İhbarına Devam Et\"]"));
        addId("DAHA FAZLA HASAR ÇEŞİDİ ARAÇ ÇALINMA", By.xpath("(//XCUIElementTypeStaticText[@name=\"Çarpma / Çarpışma / Sürtme\"])//..//..//XCUIElementTypeOther[13]//XCUIElementTypeButton"));
        addId("KARAKOL TUTANAĞI FOTOĞRAFI EKLE", By.xpath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage[3]"));


        addId("ÖDEME YAP", By.xpath("//XCUIElementTypeStaticText[@name=\"Ödeme Yap\"]"));
        addId("ÖDENMEMİŞ TAKSİT SEÇ", By.xpath("(//XCUIElementTypeStaticText[@name=\"234,00TL\"])[1]"));
        addId("KREDİ KARTI İLE ÖDE", By.xpath("//XCUIElementTypeStaticText[@name=\"Kredi Kartı ile Öde\"]"));
        addId("KART SAHİBİNİN ADI - SOYADI", By.xpath("//XCUIElementTypeTextField[@value='Adı Soyadı']"));
        addId("KREDİ KARTI NUMARASI", By.xpath("(//XCUIElementTypeStaticText[@name=\"Kredi Kartı Numarası\"])//..//XCUIElementTypeOther//XCUIElementTypeTextField"));
        addId("KART SAHİBİNİN ADI - SOYADI", By.xpath("//XCUIElementTypeTextField[@value='Adı Soyadı']"));
        addId("GEÇERLİLİK TARİHİ AY", By.xpath("//XCUIElementTypeTextField[@value='Ay']"));
        addId("GEÇERLİLİK TARİHİ YIL", By.xpath("//XCUIElementTypeTextField[@value='Yıl']"));
        addId("GÜVENLİK KODU", By.xpath("//XCUIElementTypeTextField[@value='123']"));
        addId("GEÇERLİLİK TARİHİ TAMAM", By.xpath("//XCUIElementTypeButton[@name=\"Tamam\"]"));



        addId("", By.xpath(""));
        addId("", By.xpath(""));
        addId("", By.xpath(""));
        addId("", By.xpath(""));



    }
}
