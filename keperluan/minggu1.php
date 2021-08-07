<?php
    include 'koneksi.php';
    $query = "SELECT * from minggu1"; 
    $result = $con->query($query);

    // Fetch all
    $data_minggu1 = $result->fetch_all(MYSQLI_ASSOC);

    echo json_encode($data_minggu1);

?>