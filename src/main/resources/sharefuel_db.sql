IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_Fornitore_Servizio]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [Cliente] DROP CONSTRAINT [FK_Fornitore_Servizio]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_Servizio_TipoServizio]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [Servizio] DROP CONSTRAINT [FK_Servizio_TipoServizio]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[servizio]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [Servizio] DROP CONSTRAINT [servizio]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_ServizioTipoPresa_Servizio]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [ServizioTipoPresa] DROP CONSTRAINT [FK_ServizioTipoPresa_Servizio]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[FK_ServizioTipoPresa_TipoPresa]') AND OBJECTPROPERTY(id, N'IsForeignKey') = 1) 
ALTER TABLE [ServizioTipoPresa] DROP CONSTRAINT [FK_ServizioTipoPresa_TipoPresa]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[Cliente]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [Cliente]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[Servizio]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [Servizio]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[ServizioTipoPresa]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [ServizioTipoPresa]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[TipoPresa]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [TipoPresa]
GO

IF EXISTS (SELECT 1 FROM dbo.sysobjects WHERE id = object_id(N'[TipoServizio]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1) 
DROP TABLE [TipoServizio]
GO

CREATE TABLE [Cliente]
(
	[idCliente] int NOT NULL IDENTITY (1, 1),
	[idServizio] int NOT NULL,
	[CF] varchar(50) NOT NULL,
	[email] varchar(50) NOT NULL,
	[password] varchar(50) NULL,
	[nome] varchar(50) NULL,
	[cognome] varchar(50) NULL
)
GO

CREATE TABLE [Servizio]
(
	[idServizio] int NOT NULL IDENTITY (1, 1),
	[costo] int NULL,
	[inizio_servizio] datetime2(7) NULL,
	[fine_servizio] datetime2(7) NULL,
	[idTipoServizio] int NULL,
	[coordinata_X] varchar(50) NULL,
	[idTipoPresa] int NULL,
	[coordinata_Y] varchar(50) NULL
)
GO

CREATE TABLE [ServizioTipoPresa]
(
	[idServizioTipoPresa] int NOT NULL IDENTITY (1, 1),
	[idServizio] int NOT NULL,
	[idTipoPresa] int NOT NULL
)
GO

CREATE TABLE [TipoPresa]
(
	[idTipoPresa] int NOT NULL,
	[tipo] varchar(50) NULL,
	[potenza] varchar(50) NULL
)
GO

CREATE TABLE [TipoServizio]
(
	[idTipoServizio] int NOT NULL IDENTITY (1, 1),
	[descrizione] varchar(50) NULL
)
GO

ALTER TABLE [Cliente] 
 ADD CONSTRAINT [PK_Fornitore]
	PRIMARY KEY CLUSTERED ([idCliente] ASC)
GO

ALTER TABLE [Servizio] 
 ADD CONSTRAINT [PK_Table1]
	PRIMARY KEY CLUSTERED ([idServizio] ASC)
GO

ALTER TABLE [ServizioTipoPresa] 
 ADD CONSTRAINT [PK_Table1]
	PRIMARY KEY CLUSTERED ([idServizioTipoPresa] ASC)
GO

ALTER TABLE [TipoPresa] 
 ADD CONSTRAINT [PK_Table1]
	PRIMARY KEY CLUSTERED ([idTipoPresa] ASC)
GO

ALTER TABLE [TipoServizio] 
 ADD CONSTRAINT [PK_TipoServizio]
	PRIMARY KEY CLUSTERED ([idTipoServizio] ASC)
GO

CREATE NONCLUSTERED INDEX [IXFK_Fornitore_Servizio] 
 ON [Cliente] ([idServizio] ASC)
GO

CREATE NONCLUSTERED INDEX [IXFK_Servizio_TipoPresa] 
 ON [Servizio] ([idTipoPresa] ASC)
GO

CREATE NONCLUSTERED INDEX [IXFK_Servizio_TipoServizio] 
 ON [Servizio] ([idTipoServizio] ASC)
GO

CREATE NONCLUSTERED INDEX [IXFK_ServizioTipoPresa_Servizio] 
 ON [ServizioTipoPresa] ([idServizio] ASC)
GO

CREATE NONCLUSTERED INDEX [IXFK_ServizioTipoPresa_TipoPresa] 
 ON [ServizioTipoPresa] ([idTipoPresa] ASC)
GO

ALTER TABLE [Cliente] ADD CONSTRAINT [FK_Fornitore_Servizio]
	FOREIGN KEY ([idServizio]) REFERENCES [Servizio] ([idServizio]) ON DELETE No Action ON UPDATE No Action
GO

ALTER TABLE [Servizio] ADD CONSTRAINT [FK_Servizio_TipoServizio]
	FOREIGN KEY ([idTipoServizio]) REFERENCES [TipoServizio] ([idTipoServizio]) ON DELETE No Action ON UPDATE No Action
GO

ALTER TABLE [Servizio] ADD CONSTRAINT [servizio]
	FOREIGN KEY () REFERENCES  () ON DELETE No Action ON UPDATE No Action
GO

ALTER TABLE [ServizioTipoPresa] ADD CONSTRAINT [FK_ServizioTipoPresa_Servizio]
	FOREIGN KEY ([idServizio]) REFERENCES [Servizio] ([idServizio]) ON DELETE No Action ON UPDATE No Action
GO

ALTER TABLE [ServizioTipoPresa] ADD CONSTRAINT [FK_ServizioTipoPresa_TipoPresa]
	FOREIGN KEY ([idTipoPresa]) REFERENCES [TipoPresa] ([idTipoPresa]) ON DELETE No Action ON UPDATE No Action
GO

