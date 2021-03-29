package LopTruuTuongVaGiaoDien;

public class PhuongAn {
		private boolean phuongAnDung = false;
		private String noiDung;
		private String giaiThich;
		public PhuongAn(String nd, String giaiThich)
		{
			this.noiDung = nd;
			this.giaiThich = giaiThich;
		}
		public PhuongAn(String nd, String giaiThich, boolean d)
		{
			this.noiDung = nd;
			this.giaiThich = giaiThich;
			this.phuongAnDung = d;
		}
		public boolean isPhuongAnDung() {
			return phuongAnDung;
		}
		public void setPhuongAnDung(boolean phuongAnDung) {
			this.phuongAnDung = phuongAnDung;
		}
		public String getGiaiThich() {
			return giaiThich;
		}
		public void setGiaiThich(String giaiThich) {
			this.giaiThich = giaiThich;
		}
		public String getNoiDung() {
			return noiDung;
		}
		public void setNoiDung(String noiDung) {
			this.noiDung = noiDung;
		}
		@Override
		public String toString()
		{
			return this.getNoiDung();
		}
}
