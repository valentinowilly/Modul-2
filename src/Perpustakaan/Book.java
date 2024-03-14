package Perpustakaan;

// Kelas untuk merepresentasikan buku
class Book {
    private String name;
    private String[] authors;
    private int numberOfPages;
    private int publicationYear;
    private String publisher;
    private String synopsis; // Penambahan atribut sinopsis

    // Inisialisasi konstruktor pada semua atribut yang ada
    public Book(String name, String[] authors, int numberOfPages, int publicationYear, String publisher, String synopsis) {
        this.name = name;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.synopsis = synopsis; 
    }

    // Getter methods untuk mengakses data buku 
    public String getName() {
        return name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getSynopsis() {
        return synopsis;    
    }

    // Method untuk menghitung jumlah kata pada sinopsis
    public int countSynopsisWords() {
        // Memisahkan sinopsis menjadi kata-kata menggunakan spasi sebagai delimiter
        String[] words = synopsis.split("\\s+");
        // Mengembalikan jumlah kata
        return words.length;
    }
}

// Kelas untuk merepresentasikan perpustakaan
class Library {
    private Book[][] books; // Array 2 dimensi untuk menyimpan buku dalam berbagai kategori

    // Konstruktor untuk inisialisasi perpustakaan dan buku-bukunya
    public Library() {
        books = new Book[7][6]; // Inisialisasi array 2 dimensi

        // Kategori Teknologi
        books[0] = new Book[]{
            new Book("System Requirement Analysis", new String[]{"Jeffrey O. Grady"}, 801, 2014, "Elsevier", "Analisis kebutuhan sistem untuk pengembangan perangkat lunak dan aplikasi bisnis"),
            new Book("101 Trik Excel Gaya Youtuber", new String[]{"Ignasius Ryan"}, 184, 2022, "Elex Media Komputindo", "Buku praktis untuk meningkatkan keahlian Anda dalam menggunakan Microsoft Excel"),
            new Book("Modern Operating System", new String[]{"Andrew S. Tanenbaum"}, 1076, 2008, "Pearson Prentice Hall", "Pemahaman mendalam tentang sistem operasi era modern untuk profesional IT"),
            new Book("Master Data Management", new String[]{"David Loshin"}, 274, 2009, "Morgan Kaufmann", "Strategi dan praktik terbaik dalam manajemen data untuk organisasi besar"),
            new Book("Numeral Mathematics and Computing", new String[]{"Ward Cheney", "David Kincaid"}, 678, 2013, "Brooks/Cole", "Penerapan matematika numerik dalam komputasi modern untuk solusi teknis yang efektif"),
            new Book("Computer Ethics", new String[]{"Deborah G. Johnson"}, 240, 2001, "Prentice Hall", "Perspektif etika dalam penggunaan dan pengembangan teknologi informasi dan komunikasi"),
        };

        // Kategori Filsafat
        books[1] = new Book[]{
            new Book("Filsafat Ilmu", new String[]{"Nunu Burhanuddin"}, 261, 2019, "Prenadamedia Group", "Pengantar filsafat ilmu untuk memahami esensi pengetahuan dan metodologi ilmiah"),
            new Book("Buku Studi Dasar Filsafat", new String[]{"Tazkiyah Basa'ad"}, 197, 2018, "Deepublish", "Dasar-dasar filsafat untuk pemula dalam memahami pemikiran filosofis klasik dan kontemporer"),
            new Book("Filsafat Pendidikan Islam", new String[]{"Afifuddin Harisah"}, 303, 2018, "STAIN Malikussaleh Lhokseumawe", "Tinjauan filsafat terhadap pendidikan Islam untuk mengembangkan pemahaman yang mendalam"),
            new Book("Buku Filsafat Pendidikan Vokasi", new String[]{"Soetyono Iskandar", "Mardi Syahir"}, 112, 2017, "Deepublish", "Penerapan filsafat dalam konteks pendidikan vokasional untuk meningkatkan kualitas pembelajaran"),
            new Book("Mengampuni yang Tak Terampuni", new String[]{"Nikolaus Kristiyanto"}, 161, 2022, "Pustaka Aksara", "Refleksi filsafat tentang arti pengampunan dalam kehidupan manusia dan spiritualitas"),
        };

        // Kategori Sejarah
        books[2] = new Book[]{
            new Book("A History of China", new String[]{"Frederick Wells W."}, 628, 2020, "Indoliterasi", "Eksplorasi mendalam tentang perkalanan sejarah dan perkembangan peradaban bangsa China"),
            new Book("A Brief History of The World", new String[]{"George Willis Bostford", "Jay Barret Bostfor", "dkk"}, 502, 2018, "Alexander Books", "Ringkasan sejarah dunia dari berbagai perspektif yang komprehensif dan beragam"),
            new Book("Sejarah Tembakau dan Penyebarannya", new String[]{"Billings E.R"}, 540, 2019, "Indoliterasi", "Pemahaman tentang peran tembakau dalam sejarah dan pengaruhnya dalam peradaban manusia"),
            new Book("Mengulas Dokumen Kerajaan Huristak Dari Masa ke Masa", new String[]{"Tondi Hasibuan", "Jorry Sam"}, 36, 2020, "Deepublish", "Analisis dokumen historis tentang kerajaan Huristak dari berbagai periode sejarah"),
            new Book("Sejarah Asia Barat", new String[]{"Syaiful", "Anisa Septianingrum"}, 98, 2018, "Graha Ilmu", "Penelusuran perkembangan Asia Barat dari masa lampau hingga masa kini"),
        };

        // Kategori Agama
        books[3] = new Book[]{
            new Book("Mr. Crack dari Parepare", new String[]{"Andi Makmur Makka"}, 493, 2019, "Republika Penerbit", "Perjalanan spiritual seorang tokoh yang menginspirasi dari Parepare"),
            new Book("Belajar dari Partai Masjumi", new String[]{"Artawijaya"}, 208, 2014, "Pustaka Al Kautsar", "Refleksi atas sejarah dan perjuangan Partai Masjumi dalam konteks agama"),
            new Book("Biografi Umar bin Khattab", new String[]{"Ali Muhammad ash-Shallabi"}, 501, 2019, "Pustaka Al Kautsar", "Penelusuran mendalam tentang kehidupan dan ajaran Umar bin Khattab, khalifah kedua Islam"),
            new Book("Akhlak Tasawuf", new String[]{"Muhammad Muhajir"}, 266, 2020, "Kementerian Agama RI", "Pemahaman tentang akhlak dan spiritualitas dalam tradisi tasawuf"),
            new Book("Tuhan Ada di Hatimu", new String[]{"Husein Ja'far Al-Hadar"}, 203, 2020, "Noura Books Publishing", "Eksplorasi spiritualitas dan keimanan melalui kisah narasi yang menginspirasi"),
        };

        // Kategori Psikologi
        books[4] = new Book[]{
            new Book("The Psychology of Money", new String[]{"Morgan Housel"}, 320, 2024, "Baca", "Analisis psikologis tentang hubungan manusia dengan uang dan keputusan keuangan"),
            new Book("Psikologi Perkembangan Anak Edisi 2", new String[]{"Iriani Indri Hapsari"}, 220, 2023, "Campustakaa", "Pemahaman mendalam tentang perkembangan psikologis anak dalam konteks edisi terbaru"),
            new Book("Pastoral Konseling dan Kesehatan Mental", new String[]{"Siswanto", "Mesach Krisetya"}, 240, 2023, "Penerbit Andi", "Pendekatan dari perspektif pastoral terhadap konseling dan pemeliharaan kesehatan mental"),
            new Book("Seni Berkomunikasi Menanggapi Pertanyaan Anak Yang Sulit", new String[]{"Samanta Elsener"}, 200, 2022, "Elex Media Komputindo", "Strategi komunikasi untuk merespons pertanyaan sulit anak dengan empati dan pengertian"),
            new Book("Metode Berkomunikasi Dengan Gambar", new String[]{"Nur Fatwikiningsih"}, 237, 2023, "Penerbit Andi", "Penerapan gambar dalam metode komunikasi untuk membantu pemahaman dan ekspresi"),
        };

        // Kategori Politik
        books[5] = new Book[]{
            new Book("Diaspora Bangga Berbangsa", new String[]{"Fenty Effendy"}, 200, 2023, "Penerbit Buku Kompas", "Pengalaman diaspora dalam membangun identitas dan kontribusi terhadap bangsa dan negara"),
            new Book("Jalan Tengah Golongan Karya", new String[]{"Erwin Aksa", "Sharif Cicip Sutarjo"}, 130, 2024, "Gramedia Pustaka Utama", "Analisis peran dan strategi Golongan Karya dalam politik Indonesia melalui pendekatan moderat"),
            new Book("Kiprah Politik Soekarno", new String[]{"Yonita Yulia Yalinda"}, 240, 2024, "Anak Hebat Indonesisa","Eksplorasi perjalanan politik Soekarno dan pengaruhnya terhadap perjalanan sejarah Indonesia"),
            new Book("Filsafat Pancasila", new String[]{"Nur Rohim Yunus", "Serlika Aprita"}, 268, 2022, "Refika Aditama", "Penelusuran konsep dan nilai-nilai Pancasila dalam konteks filsafat politik modern"),
            new Book("Etika Politik", new String[]{"Franz Magnis-Suseno"}, 564, 2016, "Gramedia Pustaka Utama", "Refleksi tentang prinsip-prinsip etika dalam praktik politik dan kepemimpinan"),
            new Book("The Social Contract", new String[]{"Jean Jacques Rousseau"}, 208, 2024, "Anak Hebat Indonesia", "Analisis kontrak sosial yang ada dan hubungannya dengan teori politik kontemporer"),
        };

        // Kategori Fiksi
        books[6] = new Book[]{
            new Book("Pingkan Melipat Jarak ", new String[]{"Sapardi Djoko Darmono"}, 128, 2022, "Gramedia Pustaka Utama", "Perjalanan perempuan muda yang mencari makna dalam ruang dan waktu"),
            new Book("Pasutri Gaje", new String[]{"Annisa Nisfihani"}, 232, 2024, "Falcon Publishing", "Kisah humor pasangan suami istri dalam menghadapi tantangan kehidupan sehari-hari"),
            new Book("One Punch Man 10", new String[]{"Yusuke Murata"}, 216, 2017, "Elex Media Komputindo", "Petualangan pahlawan super yang kuat dan tak terkalahkan dalam melawan musuh-musuhnya"),
            new Book("Rumah Untuk Alie", new String[]{"Lenn Liu"}, 300, 2024, "Tekad", "Kisah tentang pencarian tempat yang nyaman dan berarti bagi seorang wanita"),
            new Book("Oi Abang Oi", new String[]{"Armaraher"}, 308, 2024, "Akad", "Cerita tentang keluarga dan kehidupan sehari-hari di lingkungan perkotaan"),
            new Book("Malam Tanpa Akhir (Enddles Night)", new String[]{"Agatha Christie"}, 304, 2017, "Gramedia Pustaka Utama", "Misteri dan intrik dalam sebuah malam yang tak berujung menurut Agatha Christie"),
        };
    }

    // Method untuk menampilkan menu utama dari perpustakaan
    public void displayStartMenu(){
        // Menampilkan menu utama perpustakaan
        System.out.println("=======[Perpustakaan]=======");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n8. Tampilkan total buku yang tersedia\n9. Keluar dari program");
    }

    // Method untuk menampilkan buku berdasarkan kategori yang dipilih
    public void displayBooksByCategory(int category) {
        // Menggunakan switch case untuk memisahkan kategori
        switch (category) {
            case 1:
                displayCategoryBooks("TEKNOLOGI", books[category - 1]);
                break;
            case 2:
                displayCategoryBooks("FILSAFAT", books[category - 1]);
                break;
            case 3:
                displayCategoryBooks("SEJARAH", books[category - 1]);
                break;
            case 4:
                displayCategoryBooks("AGAMA", books[category - 1]);
                break;
            case 5:
                displayCategoryBooks("PSIKOLOGI", books[category - 1]);
                break;
            case 6:
                displayCategoryBooks("POLITIK", books[category - 1]);
                break;
            case 7:
                displayCategoryBooks("FIKSI", books[category - 1]);
                break;
            default: // Menampilkan pesan apabila pilihan tidak valid
                System.out.println("Kategori tidak valid.");
        }
    }

    // Method untuk menampilkan buku-buku dalam kategori yang dipilih
    private void displayCategoryBooks(String categoryName, Book[] categoryBooks) {
        System.out.println("=========[BUKU KATEGORI " + categoryName + "]=========");
        int bookNumber = 1;
        for (Book book : categoryBooks) {
            if (book != null) {
                displayBookDetails(book, bookNumber++);
            }
        }
    }

    // Method untuk menampilkan detail buku
    private void displayBookDetails(Book book, int bookNumber) {
        // Menampilkan detail buku seperti nama, penulis, halaman, tahun terbit, dan penerbit
        System.out.println("Buku ke-" + bookNumber);
        System.out.println("1. Nama Buku\t\t: " + book.getName());
        System.out.println("2. Penulis\t\t: " + String.join(", ", book.getAuthors()));
        System.out.println("3. Jumlah Halaman\t: " + book.getNumberOfPages());
        System.out.println("4. Tahun Terbit\t\t: " + book.getPublicationYear());
        System.out.println("5. Nama Penerbit\t: " + book.getPublisher());
        System.out.println("6. Sinopsis\t\t: " + book.getSynopsis()); // Penambahan output sinopsis

        // Method untuk memeriksa jumlah kata pada sinopsis
        int synopsisWordCount = book.countSynopsisWords();
        // Seleksi if else untuk memeriksa dan mencetak output jumlah kata
        if (synopsisWordCount < 10) { // Jika jumlah kata kurang dari nilai minimal(10)
            System.out.println("Sinopsis terlalu pendek.");
        } else {
            System.out.println("Jumlah kata sinopsis\t: " + synopsisWordCount);
        }
        System.out.println();
    }

    // Method untuk menampilkan total buku yang tersedia di perpustakaan
    public void displayTotalBooksAvailable() {
        // Menghitung total buku yang tersedia dalam semua kategori
        int total = 0;
        for (Book[] category : books) {
            for (Book book : category) {
                if (book != null) {
                    total++;
                }
            }
        }
        System.out.println("Total buku yang tersedia di perpustakaan: " + total);
    }

    // Method untuk keluar dari program 
    public void exitProgram() {
        // Menampilkan pesan terima kasih dan mengakhiri program
        System.out.println("Terima kasih telah menggunakan layanan perpustakaan.");
        System.exit(0);
    }
}