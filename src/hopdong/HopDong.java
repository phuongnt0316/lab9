package hopdong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HopDong {
    String soHopDong;
    String ngayHopDong;
    int giaTri;
    String loaiTien;
    List<HoaDon> list;

    public HopDong(String soHopDong, String ngayHopDong, int giaTri, String loaiTien) {
        this.soHopDong = soHopDong;
        this.ngayHopDong = ngayHopDong;
        this.giaTri = giaTri;
        this.loaiTien = loaiTien;
        this.list = new ArrayList<>();
    }
    public void setlist(HoaDon hd){
        this.list.add(hd);
    }

    public void xuat(){
        System.out.println(soHopDong+"/"+ngayHopDong+"/"+giaTri+"/"+loaiTien);
        for(HoaDon item:list){
            System.out.println("----"+item.getSoHoaDon()+"/"+item.getGiaTrihd()+"/"+item.getLoaiTienhd());

        }
    }

    public static void main(String[] args) {
        List<A> lista=new ArrayList<>();
        lista.add(new A("hopdong1","11/2/2023",1000,"vnd","hoadon1",500,"vnd"));
        lista.add(new A("hopdong2","11/2/2020",2000,"vnd","hoadon2",600,"vnd"));
        lista.add(new A("hopdong3","11/2/2022",3000,"vnd","hoadon1",500,"vnd"));
        lista.add(new A("hopdong1","11/2/2023",1000,"vnd","hoadon3",700,"vnd"));
        lista.add(new A("hopdong2","11/2/2020",2000,"vnd","hoadon4",800,"vnd"));
        lista.add(new A("hopdong1","11/2/2023",1000,"vnd","hoadon5",900,"vnd"));
        Map<String,HopDong> hopDongMap=new LinkedHashMap<>();
        HopDong hopDong=new HopDong();
       // List<HopDong> hopDongList=new ArrayList<>();
        for(A item:lista){
            String sohopdong=item.getSoHopDong();
            if(hopDongMap.containsKey(sohopdong)){ //neu da ton tai sohopdong thi them moi hoadon vao list

                hopDong=hopDongMap.get(sohopdong);
                HoaDon hoaDon=new HoaDon(item.getSoHoaDon(), item.getGiaTrihd(), item.getLoaiTienhd());
                hopDong.setlist(hoaDon);

            }else {// neu chua ton tai sohopdong thi them key sohopdong va them moi hoadon vao list
                hopDong=new HopDong(sohopdong,item.getNgayHopDong(),item.getGiaTri(),item.getLoaiTien());
                HoaDon hoaDon=new HoaDon(item.getSoHoaDon(), item.getGiaTrihd(), item.getLoaiTienhd());
                hopDong.setlist(hoaDon);
                hopDongMap.put(sohopdong,hopDong);

              //  hopDongList.add(hopDong);
            }
        }


        List<HopDong> hopDongList = new ArrayList<>(hopDongMap.values());
        for(HopDong item:hopDongList){
            item.xuat();
        }
    }

}
