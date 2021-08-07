<?php
    include 'koneksi.php';
    $query = "SELECT * from minggu2"; 
    $result = $con->query($query);

    // Fetch all
    $data_minggu2 = $result->fetch_all(MYSQLI_ASSOC);

    echo json_encode($data_minggu2);

?>