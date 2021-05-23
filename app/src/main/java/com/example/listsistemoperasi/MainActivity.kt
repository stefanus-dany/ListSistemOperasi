package com.example.listsistemoperasi

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var aboutButton: ImageView
    private lateinit var adapter: SistemOperasiAdapter
    private lateinit var data: MutableList<SistemOperasiModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        aboutButton = findViewById(R.id.aboutButton)
        recyclerView = findViewById(R.id.recyclerView)
        data = mutableListOf()
        adapter = SistemOperasiAdapter()
        adapter.dataOS = data
        adapter.mContext = applicationContext
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        init()

        aboutButton.setOnClickListener {
            startActivity(Intent(this, About::class.java))
        }

    }

    private fun init() {
        data.add(
            SistemOperasiModel(
                "Developed by\nGoogle",
                "Initial release\n2008",
                "Location\nCalifornia, US",
                R.drawable.google1,
                R.drawable.google2,
                R.drawable.android,
                "Android",
                "Android adalah sistem operasi berbasis Linux yang dirancang untuk perangkat bergerak layar sentuh seperti telepon pintar dan komputer tablet",
                "Android adalah sistem operasi berbasis Linux yang dirancang untuk perangkat bergerak layar sentuh seperti telepon pintar dan komputer tablet. Android awalnya dikembangkan oleh Android, Inc., dengan dukungan finansial dari Google, yang kemudian membelinya pada tahun 2005. Sistem operasi ini dirilis secara resmi pada tahun 2007, bersamaan dengan didirikannya Open Handset Alliance, konsorsium dari perusahaan-perusahaan perangkat keras, perangkat lunak, dan telekomunikasi yang bertujuan untuk memajukan standar terbuka perangkat seluler. Ponsel Android pertama mulai dijual pada bulan Oktober 2008."
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nMicrosoft",
                "Initial release\n2010",
                "Location\nWashington, US",
                R.drawable.windowsphone1,
                R.drawable.windowsphone2,
                R.drawable.windowsphone,
                "Windows Phone",
                "Windows Phone adalah keluarga sistem operasi perangkat bergerak yang dikembangkan oleh Microsoft dan merupakan pengganti platform Windows Mobile, meski tidak kompatibel lagi.",
                "Windows Phone adalah keluarga sistem operasi perangkat bergerak yang dikembangkan oleh Microsoft dan merupakan pengganti platform Windows Mobile, meski tidak kompatibel lagi. Tidak seperti pendahulunya, Windows Phone ditujukan pada pasar konsumen alih alih perusahaan. Sistem operasi ini pertama diluncurkan bulan Oktober 2010 dan diluncurkan di Asia pada awal 2011."
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nApple Inc.",
                "Initial release\n2007",
                "Location\nCalifornia, US",
                R.drawable.apple1,
                R.drawable.apple2,
                R.drawable.apple,
                "Iphone",
                "adalah jajaran telepon pintar yang dirancang dan dipasarkan oleh Apple Inc.",
                "Iphone adalah jajaran telepon pintar yang dirancang dan dipasarkan oleh Apple Inc. iPhone menggunakan sistem operasi telepon genggam iOS Apple yang dikenal dengan nama \"iPhone OS\" sampai pertengahan 2010, sesaat setelah peluncuran iPad. iPhone pertama diluncurkan tanggal 29 Juni 2007;[14] iPhone terbaru, yaitu iPhone 7 dan iPhone 7 plus generasi kesepuluh, diluncurkan pada tanggal 16 September 2016"
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nBlackBerry Ltd.",
                "Initial release\n1999",
                "Location\nOntario, Canada",
                R.drawable.bb1,
                R.drawable.bb2,
                R.drawable.bb,
                "Blackberry",
                "BlackBerry adalah telepon seluler yang memiliki kemampuan layanan push e-mail, telepon, sms, menjelajah internet, BlackBerry Messenger (BBM), dan berbagai kemampuan nirkabel lainnya.",
                "BlackBerry adalah telepon seluler yang memiliki kemampuan layanan push e-mail, telepon, sms, menjelajah internet, BlackBerry Messenger (BBM), dan berbagai kemampuan nirkabel lainnya. Penggunaan gawai canggih ini begitu fenomenal belakangan ini, sampai menjadi suatu kebutuhan untuk fashion. BlackBerry pertama kali diperkenalkan pada tahun 1999 oleh perusahaan Kanada, BlackBerry."
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nTim Berners-Lee",
                "Initial release\n1989",
                "Location\nSanta Clara, California",
                R.drawable.webos1,
                R.drawable.webos2,
                R.drawable.webos,
                "Web OS",
                "adalah sistem operasi yang dimiliki oleh LG (sebelumnya milik Hewlett-Packard) dan berbasis Linux.",
                "Web OS adalah sistem operasi yang dimiliki oleh LG (sebelumnya milik Hewlett-Packard) dan berbasis Linux. Awalnya dikembangkan oleh Palm, kemudian diambil oleh Hewlett-Packard untuk digunakan pada perangkat pintar seperti Smart TV. webOS diperkenalkan oleh Palm pada bulan Januari 2009, tetapi pada tanggal 18 Agustus 2011, HP mengumumkan untuk tidak melanjutkan pembuatan semua peranti keras yang menggunakan webOS"
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nCanonical Ltd.",
                "Initial release\n2004",
                "Location\nLondon, UK",
                R.drawable.ubuntu1,
                R.drawable.ubuntu2,
                R.drawable.ubuntu,
                "Ubuntu",
                "merupakan salah satu distribusi Linux yang berbasis Debian dan didistribusikan sebagai perangkat lunak bebas.",
                "Ubuntu merupakan salah satu distribusi Linux yang berbasis Debian dan didistribusikan sebagai perangkat lunak bebas. Ubuntu ditawarkan dalam tiga edisi resmi: Ubuntu Desktop[10] untuk komputer pribadi, Ubuntu Server untuk server[11] dan komputasi awan,[12] dan Ubuntu Core[13] untuk \"Internet untuk Segala\",[14] perangkat kecil dan robot.[15][16] Versi baru Ubuntu dengan dukungan standar dirilis tujuh bulan sekali, sementara untuk versi dukungan jangka-panjang (LTS) dirilis dua tahun sekali"
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nMicrosoft",
                "Initial release\n2009",
                "Location\nWashington, US",
                R.drawable.windows71,
                R.drawable.windows72,
                R.drawable.windows7,
                "Windows 7",
                "Windows 7 adalah versi windows terakhir yang menggunakan menu start yang menggantikan versi windows sebelumnya, Windows Vista.",
                "Windows 7 adalah versi windows terakhir yang menggunakan menu start yang menggantikan versi windows sebelumnya, Windows Vista.[5] Windows 7 dirilis untuk pabrikan komputer pada 22 Juli 2009 dan dirilis untuk publik pada 22 Oktober 2009[6], kurang dari tiga tahun setelah rilis pendahulunya, Windows Vista.\n" +
                        "\n" +
                        "Tidak seperti pendahulunya yang memperkenalkan banyak fitur baru, Windows 7 lebih fokus pada pengembangan dasar Windows, dengan tujuan agar lebih kompatibel dengan aplikasi-aplikasi dan perangkat keras komputer yang kompatibel dengan Windows Vista."
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nApple Inc.",
                "Initial release\n2001",
                "Location\nCalifornia, US",
                R.drawable.macos1,
                R.drawable.macos2,
                R.drawable.macos,
                "Mac OS X",
                "adalah sistem operasi dengan antarmuka grafis yang dikembangkan dan didistribusikan oleh Apple Inc.",
                "MacOS, atau yang sebelumnya disebut OS X, adalah sistem operasi dengan antarmuka grafis yang dikembangkan dan didistribusikan oleh Apple Inc. Sistem operasi ini disediakan untuk komputer Macintosh. Sistem operasi ini pertama kali dikeluarkan pada tahun 2001 dan populer di kalangan pengguna."
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nThe Debian Project",
                "Initial release\n1993",
                "Location\nAround the World",
                R.drawable.debian1,
                R.drawable.debian2,
                R.drawable.debian,
                "Debian",
                "adalah sistem operasi komputer yang tersusun dari paket-paket perangkat lunak yang dirilis sebagai perangkat lunak bebas dan terbuka dengan lisensi mayoritas GNU General Public License dan lisensi perangkat lunak bebas lainnya.",
                "Debian adalah sistem operasi komputer yang tersusun dari paket-paket perangkat lunak yang dirilis sebagai perangkat lunak bebas dan terbuka dengan lisensi mayoritas GNU General Public License dan lisensi perangkat lunak bebas lainnya. Debian GNU/Linux memuat perkakas sistem operasi GNU dan kernel Linux merupakan distribusi Linux yang populer dan berpengaruh. Debian didistribusikan dengan akses ke repositori dengan ribuan paket perangkat lunak yang siap untuk instalasi dan digunakan."
            )
        )
        data.add(
            SistemOperasiModel(
                "Developed by\nMicrosoft",
                "Initial release\n2015",
                "Location\nWashington, US",
                R.drawable.windows101,
                R.drawable.windows102,
                R.drawable.windows10,
                "Windows 10",
                "Windows 10 merupakan sistem operasi komputer pribadi yang dikembangkan oleh Microsoft sebagai bagian dari keluarga sistem operasi Windows NT.",
                "Windows 10 merupakan sistem operasi komputer pribadi yang dikembangkan oleh Microsoft sebagai bagian dari keluarga sistem operasi Windows NT. Diperkenalkan pada tanggal 30 September 2014,[3] dirilis pada 29 Juli 2015 dan pada November 2015, Threshold 2 dari Windows 10 (v10.0.10586) dirilis kepada publik.\n" +
                        "\n" +
                        "Pertama diperkenalkan pada bulan April 2014 pada Konferensi Build, Windows 10 bertujuan untuk mengatasi kekurangan dalam antarmuka pengguna pertama kali diperkenalkan oleh Windows 8 dengan menambahkan mekanik tambahan yang dirancang untuk meningkatkan pengalaman pengguna untuk perangkat yang tidak ada layar sentuh (seperti komputer meja dan laptop), termasuk kebangkitan menu Mulai yang terlihat di Windows 7, sistem desktop maya, dan kemampuan untuk menjalankan aplikasi Bursa Windows dalam jendela pada desktop daripada modus layar penuh."
            )
        )
    }
}