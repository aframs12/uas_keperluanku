<?php
    include 'koneksi.php';
    $query = "SELECT * from minggu3"; 
    $result = $con->query($query);

    // Fetch all
    $data_minggu3 = $result->fetch_all(MYSQLI_ASSOC);

    echo json_encode($data_minggu3);

?>