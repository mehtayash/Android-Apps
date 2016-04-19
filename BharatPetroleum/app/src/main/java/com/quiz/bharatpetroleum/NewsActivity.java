package com.quiz.bharatpetroleum;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ymehta on 09/05/15.
 */
public class NewsActivity extends Activity {

    Button hindiNews, gujratiNews, EnglishNews;
    TextView textHeadlines,textDescription;
    ImageView imgNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newslayout);
    }

    public void getFromJagran(){

        String htmlText = "</script><script src=\"http://w.sharethis.com/button/buttons.js\" type=\"text/javascript\"></script><script type=\"text/javascript\">stLight.options({publisher: \"235fc5cd-fa8d-44cb-9313-862496c2228c\", doNotHash: false, doNotCopy: false, hashAddressBar: false});</script><div id=\"fb-root\"></div><script src=\"http://connect.facebook.net/en_US/all.js\"></script><script>\n" +
                "     FB.init({ \n" +
                "        appId:'717285121682474', cookie:true,\n" +
                "        status:true, xfbml:true \n" +
                "     });\n" +
                "function shareonwall(){\n" +
                "     FB.ui({ method: 'feed', \n" +
                "       message: 'Facebook for Websites is super-cool',\n" +
                "        name: 'कोलकाता में पीएम मोदी ने लांच की तीन योजनाएं',\n" +
                "        link: document.URL,\n" +
                "        caption: 'www.jagran.com',\n" +
                "        picture: 'http://images.jagran.com/images//09_05_2015-pmlaunch09.jpg',\n" +
                "        description: 'पश्चिम बंगाल दौरे पर प्रधानमंत्री नरेंद्र मोदी ने आज एक पेंशन और दो बीमा योजनाओं की सौगात दी। पीएम म'\n" +
                "        });\n" +
                "}\n" +
                "  </script><section class=\"articaldetail\">\n" +
                "<a class=\"arti_mid btprev\" href=\"/bihar/buxar-rajpur-inspector-shout-himself-with-service-revolver-12345663.html\"><i></i><span>Previous</span></a><a class=\"arti_mid btnext\" href=\"/haryana/panipat-12346509.html\"><span>Next</span><i></i></a><a class=\"arti_rhs btprev\" href=\"/bihar/buxar-rajpur-inspector-shout-himself-with-service-revolver-12345663.html\">Previous</a><a class=\"arti_rhs btnext\" href=\"/haryana/panipat-12346509.html\">Next</a>\n" +
                "<div class=\"clear\"></div>\n" +
                "<section class=\"title\">\n" +
                "<h1 itemprop=\"headline\">कोलकाता में पीएम मोदी ने लांच की तीन योजनाएं</h1>\n" +
                "<section class=\"grayrow\">\n" +
                "<span class=\"date\">Publish Date:Sat, 09 May 2015 04:51 PM (IST) | Updated Date:Sat, 09 May 2015 06:56 PM (IST)</span>\n" +
                "<section class=\"clear\"></section>\n" +
                "</section>\n" +
                "</section>\n" +
                "<div style=\"width:660px; height:80px;\" class=\"adsbygoogle\">\n" +
                "<script src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script><ins data-ad-slot=\"9038045571\" data-ad-client=\"ca-pub-5467088872192028\" style=\"display:inline-block;width:660px;height:80px\" class=\"adsbygoogle\"></ins><script>(adsbygoogle = window.adsbygoogle || []).push({});</script>\n" +
                "<div class=\"clear\"></div>\n" +
                "</div>\n" +
                "<div class=\"socialAartical\">\n" +
                "<ul class=\"social-icons\">\n" +
                "<li class=\"facebookshare\">\n" +
                "<input onclick=\"shareonwall()\" value=\"share\" class=\"fb_share\" src=\"/Resources/jagran/images/fb_share.png\" type=\"image\">\n" +
                "</li>\n" +
                "<li class=\"facebooklike\">\n" +
                "<span displayText=\"Facebook Like\" class=\"st_fblike_hcount\"></span>\n" +
                "</li>\n" +
                "<li class=\"googleplus\">\n" +
                "<span displayText=\"Google +1\" class=\"st_plusone_hcount\"></span>\n" +
                "</li>\n" +
                "<li class=\"twitterfa\">\n" +
                "<span displayText=\"Tweet\" class=\"st_twitter_hcount\"></span>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<section class=\"sizeadjester\">\n" +
                "<a target=\"_blank\" class=\"whatsapp\" id=\"whatsapp\" href=\"whatsapp://send?text=To know more on %22%22, click the link - http://www.jagran.com/ (Sent from http://www.jagran.com/) \" data-action=\"share/whatsapp/share \"><img alt=\"\" src=\"backup for main site//Resources/jagran/images/logo_whatsapp.png\"></a><a href=\"javascript:void(0);\" onclick=\"javascript:decreaseFontSize();\" id=\"fading3-tooltip\" class=\"less big\"></a><a href=\"javascript:void(0);\" onclick=\"javascript:increaseFontSize();\" id=\"fading-tooltip\" class=\"plus\"></a>\n" +
                "</section>\n" +
                "</div>\n" +
                "<section class=\"articaltext\">\n" +
                "<div class=\"boxgrid\">\n" +
                "<img itemprop=\"image\" src=\"http://images.jagran.com/images/09_05_2015-pmlaunch09.jpg\" border=\"0\"><span>कोलकाता में पीएम मोदी ने लांच की तीन योजनाएं</span>\n" +
                "</div><p>\n" +
                "<p style=\"text-align: justify;\">नई दिल्ली। पश्चिम बंगाल दौरे पर प्रधानमंत्री नरेंद्र मोदी ने आज एक पेंशन और दो बीमा योजनाओं की सौगात दी। पीएम मोदी ने कोलकाता में इन तीनों योजना को लांच किया। इस दौरान प्रदेश की मुख्यमंत्री ममता बनर्जी भी मौजूद थीं। इन योजनाओं के नाम हैं - प्रधानमंत्री जीवन ज्योति बीमा योजना, प्रधानमंत्री सुरक्षा बीमा योजना और अटल पेंशन योजना। आज से ही दर्जनभर केंद्रीय मंत्री इन योजनाओं को लेकर देशभर में जनता के बीच जाएंगे।</p><p>\n" +
                "\n" +
                "<p style=\"text-align: justify;\">इससे पहले पीएम नरेंद्र मोदी दो दिन के पश्चिम बंगाल दौरे पर आज कोलकाता पहुंचे। बताया गया है कि मोदी नियत समय से 45 मिनट पहले ही कोलकाता पहुंच गए। वायुसेना के विमान से कोलकाता पहुंचने पर राज्यपाल केएन त्रिपाठी, प्रदेश सरकार के वित्त मंत्री अमित मित्रा व भाजपा नेताओं ने पीएम मोदी की अगवानी की। इस बात की उम्मीद की जा रही है कि पीएम मोदी आज नेताजी सुभाष चंद्र बोस के परिजनों से मुलाकात करेंगे।</p><p>\n" +
                "\n" +
                "<p style=\"text-align: justify;\"> </p><p>\n" +
                "\n" +
                "<p style=\"text-align: justify;\">वित्त मंत्रालय ने जानकारी दी थी कि, प्रधानमंत्री कोलकाता में  आज इन योजनाओं को लांच करेंगे, उसी समय देशभर में भी इन्हें लांच किया जाएगा। इसके लिए विभिन्न राज्यों में 112 स्थानों पर विशेष कार्यक्रम आयोजित किए गए हैं। इन कार्यक्रमों में संबंधित राज्य के मुख्यमंत्री या राज्यपाल और केंद्रीय मंत्री शिरकत करेंगे।</p><p>\n" +
                "\n" +
                "<p style=\"text-align: justify;\">पढ़ेंः <a href=\"http://www.jagran.com/news/national-children-ask-question-to-pm-narendra-modi-12345676.html\">बच्चों के रोचक सवालों का प्रधानमंत्री ने दिया अपने अंदाज जवाब</a></p><p>\n" +
                "\n" +
                "<p style=\"text-align: justify;\">पढ़ेंः <a href=\"http://www.jagran.com/news/national-modi-will-starts-three-scheme-in-bengal-12343608.html\">बंगाल में तीन योजनाओं की शुरुआत करेंगे मोदी</a></p><p>\n" +
                "</p><div class=\"clear\"></div>\n" +
                "<div style=\"background: #F5F3F3;display: block;padding: 3px 5px 2px 5px;font-weight: bold;font-size: 12px;border: solid 1px #9C9C9C;\">\n" +
                "<a style=\"display: block;padding: 4px 0 0 0;color: #0A67A4;font-size: 18px;\" href=\"http://xads.zedo.com/ads2/c?a=2123601;g=0;c=1480000076;i=0;x=4096;n=1480;s=6;k=http://campaign.bharatmatrimony.com/track/clicktrack.php?trackid=00100129213804\" target=\"_blank\">&raquo; भारत मैट्रीमोनी- भारत की सबसे भरोसेमंद मैट्रीमोनी सेवा। - मुफ्त साइन अप! </a>\n" +
                "<div class=\"clear\"></div>\n" +
                "<span style=\"float: right;font-size: 11px;font-weight: normal;color: #a1a1a1;line-height: 16px;\">Sponsored</span>\n" +
                "<div class=\"clear\"></div>\n" +
                "</div>\n" +
                "<div class=\"clear\"></div>\n" +
                "<div style=\"margin:10px 0; width:100%; float:left;\">\n" +
                "<script type=\"text/javascript\">(function() {var d=document, g=d.createElement(\"script\"), s=d.getElementsByTagName(\"script\")[0];g.type=\"text/javascript\";g.async=true;g.defer=true;g.src=\"http://ctl2.buyt.in/jagran/jagran.js\";s.parentNode.insertBefore(g,s);})();</script>\n" +
                "</div>\n" +
                "<div class=\"socialbarline\">\n" +
                "<strong>ताजा खबरें, फोटो, वीडियो व लाइव स्कोर देखने के लिए क्लिक करें <a href=\"http://m.jagran.com/\" target=\"_blank\">m.jagran.com</a> पर</strong><small>या</small>\n" +
                "<div class=\"clear\"></div>\n" +
                "<ul class=\"border\">\n" +
                "<li>\n" +
                "<strong>जागरण एप्लीकेशन डाउनलोड करें</strong>\n" +
                "</li>\n" +
                "<li class=\"chorme\">\n" +
                "<a target=\"_blank\" href=\"https://chrome.google.com/webstore/detail/inolmjbojghkehmmlbdmpdlmagalddni\"><i class=\"fa fa-globe\"></i></a>\n" +
                "</li>\n" +
                "<li class=\"android\">\n" +
                "<a target=\"_blank\" href=\"https://play.google.com/store/apps/details?id=com.hindi.jagran.android.activity\"><i class=\"fa fa-android\"></i></a>\n" +
                "</li>\n" +
                "<li class=\"ipad\">\n" +
                "<a target=\"_blank\" href=\"http://itunes.apple.com/us/app/dainik-jagran-for-ipad/id507721843?mt=8\"><i class=\"fa fa-tablet\"></i></a>\n" +
                "</li>\n" +
                "<li class=\"iphone\">\n" +
                "<a target=\"_blank\" href=\"https://itunes.apple.com/us/app/jagran/id811089335?mt=8\"><i class=\"fa fa-apple\"></i></a>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<div class=\"clear\"></div>\n" +
                "</div>\n" +
                "<p style=\"font-size:13px;\">\n" +
                "<b><a href=\"#last\" class=\"iconcomment\">कमेंट करें</a></b>\n" +
                "</p>\n" +
                "<p itemprop=\"keywords\">\n" +
                "<strong>Tags:</strong>";

        String newsHeadline, newsImage, newsDetail;

        int hdStart = htmlText.indexOf("itemprop=\"headline\"") + 20;
        String tempHead = htmlText.substring((hdStart));
        int hdEnd = tempHead.indexOf("</h1>");
        newsHeadline = tempHead.substring(0, hdEnd);

        int imgStart = htmlText.indexOf()


    }

}
