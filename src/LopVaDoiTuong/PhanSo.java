package LopVaDoiTuong;

import java.lang.Comparable;

public class PhanSo implements Comparable<PhanSo>{
	private int tuSo;
	private int mauSo;
	private static int soLuong = 0;
	public PhanSo()
	{
		this(0,1);
	}
	public PhanSo(int t, int m)
	{
		this.tuSo = t;
		this.mauSo = m;
		soLuong++;
	}
	public void hienThi()
	{
		System.out.printf("%d/%d", this.tuSo, this.mauSo);
		System.out.println();
	}
	public int soNhoHon()
	{
		int soNhoHon = this.tuSo;
		if(this.tuSo < this.mauSo)
		{
			soNhoHon = this.tuSo;
		}
		else
		{
			soNhoHon = this.mauSo;
		}
		return soNhoHon;
	}
	public PhanSo cong1()
	{
		return new PhanSo(this.tuSo+1, this.mauSo+1);
	}
	public PhanSo rutGon()
	{
		int soNhoHon = this.tuSo;
		if(this.tuSo < this.mauSo)
		{
			soNhoHon = this.tuSo;
		}
		else
		{
			soNhoHon = this.mauSo;
		}
		for(int i=2; i <= soNhoHon;)
		{
			if((this.tuSo%i == 0) & (this.mauSo%i == 0))
			{
				this.tuSo = this.tuSo/i;
				this.mauSo = this.mauSo/i;
				return new PhanSo(this.tuSo, this.mauSo).rutGon();
			}
		}
		return new PhanSo(this.tuSo, this.mauSo);
	}
	public PhanSo cong(PhanSo p)
	{
		if(this.mauSo == p.mauSo)
		{
			this.tuSo = this.tuSo + p.tuSo;
		}
		else
		{
			this.mauSo = this.mauSo * p.mauSo;
			this.tuSo = this.tuSo*p.mauSo + p.tuSo*this.mauSo;
			this.rutGon();
		}
		return new PhanSo(this.tuSo, this.mauSo);
	}
	public PhanSo tru(PhanSo p)
	{
		if(this.mauSo == p.mauSo)
		{
			this.tuSo = this.tuSo - p.tuSo;
		}
		else
		{
			this.mauSo = this.mauSo * p.mauSo;
			this.tuSo = this.tuSo*p.mauSo - p.tuSo*this.mauSo;
			this.rutGon();
		}
		return new PhanSo(this.tuSo, this.mauSo);
	}
	public PhanSo nhan(PhanSo p)
	{
		this.tuSo = this.tuSo * p.tuSo;
		this.mauSo = this.tuSo * p.tuSo;
		return new PhanSo(this.tuSo, this.mauSo);
	}
	public PhanSo chia(PhanSo p)
	{
		this.tuSo = this.tuSo * p.mauSo;
		this.mauSo = this.mauSo * p.tuSo;
		return new PhanSo(this.tuSo, this.mauSo);
	}
	@Override
	public int compareTo(PhanSo p)
	{
		if(this.mauSo == p.mauSo)
		{
			if(this.tuSo == p.tuSo)
			{
				return 0;
			}
			else if(this.tuSo > p.tuSo)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			int thisTuSo = this.tuSo * p.mauSo;
			int pTuSo = p.tuSo * this.mauSo;
			return thisTuSo > pTuSo ? 1 : thisTuSo < pTuSo ? -1 : 0;
		}
	}
	public static int getSoLuong()
	{
		return soLuong;
	}
	public static void setSoLuong(int v)
	{
		soLuong = v;
	}
	public static int ucln(int a, int b)
	{
		while(a != b)
		{
			if(a > b)
				a -= b;
			else
				b -= a;
		}
		return a;
	}
	
}
