// Description: Java 25 protected interface for a CFBam schema.

/*
 *	server.markhome.mcf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.mcf.v3_1.cfbam.cfbamprot;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.math.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.*;
import java.util.*;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.xml.CFLibXmlUtil;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import java.util.concurrent.atomic.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfbam.cfbampub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecprot.*;
import server.markhome.mcf.v3_1.cfint.cfintprot.*;

		import server.markhome.mcf.v3_1.cfsec.cfsecprot.buff.CFSecProtBuffFactoryService;
		import server.markhome.mcf.v3_1.cfint.cfintprot.buff.CFIntProtBuffFactoryService;
//import server.markhome.mcf.v3_1.cfbam.cfbamprot.buff.CFBamProtBuffSchema;
//import server.markhome.mcf.v3_1.cfbam.cfbamprot.buff.CFBamProtBuffFactoryService;

public interface ICFBamProtSchema
extends ICFSecProtSchema,
	ICFIntProtSchema
{

	public static final String SCHEMA_NAME = "CFBam";
	public static final String DBSCHEMA_NAME = "CFBam31";
	static final AtomicReference<ApplicationContext> arApplicationContext = new AtomicReference<>(null);
	public static final CFSecProtTableData TABLE_DATA[] = {new CFSecProtTableData("CFBam", "Chain", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "EnumTag", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "IndexCol", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Param", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "RelationCol", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "RoleDef", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "SchemaRole", "RoleDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Scope", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "SchemaDef", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "SchemaRef", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ServerMethod", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ServerObjFunc", "ServerMethod", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ServerProc", "ServerMethod", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ServerListFunc", "ServerMethod", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Table", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ClearDep", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ClearSubDep1", "ClearDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ClearSubDep2", "ClearDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ClearSubDep3", "ClearDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "ClearTopDep", "ClearDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DelDep", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DelSubDep1", "DelDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DelSubDep2", "DelDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DelSubDep3", "DelDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DelTopDep", "DelDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Index", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "PopDep", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "PopSubDep1", "PopDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "PopSubDep2", "PopDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "PopSubDep3", "PopDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "PopTopDep", "PopDep", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Relation", "Scope", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Tweak", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TableTweak", "Tweak", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "SchemaTweak", "Tweak", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "IndexTweak", "Tweak", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Value", null, true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Atom", "Value", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "BlobDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "BlobType", "BlobDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "BlobCol", "BlobDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "BoolDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "BoolType", "BoolDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "BoolCol", "BoolDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DateDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DateType", "DateDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DateCol", "DateDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DoubleDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DoubleType", "DoubleDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DoubleCol", "DoubleDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "FloatDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "FloatType", "FloatDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "FloatCol", "FloatDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int16Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int16Type", "Int16Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Id16Gen", "Int16Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "EnumDef", "Int16Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "EnumType", "EnumDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int16Col", "Int16Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int32Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int32Type", "Int32Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Id32Gen", "Int32Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int32Col", "Int32Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int64Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int64Type", "Int64Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Id64Gen", "Int64Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Int64Col", "Int64Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NmTokenDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NmTokenType", "NmTokenDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NmTokenCol", "NmTokenDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NmTokensDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NmTokensType", "NmTokensDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NmTokensCol", "NmTokensDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NumberDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NumberType", "NumberDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "NumberCol", "NumberDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash128Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash128Col", "DbKeyHash128Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash128Type", "DbKeyHash128Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash128Gen", "DbKeyHash128Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash160Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash160Col", "DbKeyHash160Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash160Type", "DbKeyHash160Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash160Gen", "DbKeyHash160Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash224Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash224Col", "DbKeyHash224Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash224Type", "DbKeyHash224Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash224Gen", "DbKeyHash224Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash256Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash256Col", "DbKeyHash256Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash256Type", "DbKeyHash256Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash256Gen", "DbKeyHash256Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash384Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash384Col", "DbKeyHash384Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash384Type", "DbKeyHash384Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash384Gen", "DbKeyHash384Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash512Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash512Col", "DbKeyHash512Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash512Type", "DbKeyHash512Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "DbKeyHash512Gen", "DbKeyHash512Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "StringDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "StringType", "StringDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "StringCol", "StringDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZDateDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZDateType", "TZDateDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZDateCol", "TZDateDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZTimeDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZTimeType", "TZTimeDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZTimeCol", "TZTimeDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZTimestampDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZTimestampType", "TZTimestampDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TZTimestampCol", "TZTimestampDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TextDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TextType", "TextDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TextCol", "TextDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TimeDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TimeType", "TimeDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TimeCol", "TimeDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TimestampDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TimestampType", "TimestampDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TimestampCol", "TimestampDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TokenDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TokenType", "TokenDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TokenCol", "TokenDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt16Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt16Type", "UInt16Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt16Col", "UInt16Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt32Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt32Type", "UInt32Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt32Col", "UInt32Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt64Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt64Type", "UInt64Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UInt64Col", "UInt64Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UuidDef", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UuidType", "UuidDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UuidGen", "UuidType", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "UuidCol", "UuidDef", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Uuid6Def", "Atom", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Uuid6Type", "Uuid6Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Uuid6Gen", "Uuid6Type", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "Uuid6Col", "Uuid6Def", true, false, "Tenant", "Public"),
		new CFSecProtTableData("CFBam", "TableCol", "Value", true, false, "Tenant", "Public")};
	public static final AtomicReference<CFSecProtTableData[]> consolidatedProtTableData = new AtomicReference<>(null);
	public static final CFSecProtRoleInfo ROLE_INFO[] = {};
	public static final AtomicReference<CFSecProtRoleInfo[]> consolidatedProtRoleInfo = new AtomicReference<>(null);
	public static CFSecProtTableData[] getProtTableData() {
		return TABLE_DATA;
	}

	public static CFSecProtTableData[] getConsolidatedProtTableData() {
		if (consolidatedProtTableData.get() == null) {
			ArrayList<CFSecProtTableData> lst = new ArrayList<>();
			for( CFSecProtTableData data: ICFSecProtSchema.getTableData()) {
				lst.add(data);
			}
			for( CFSecProtTableData data: ICFIntProtSchema.getTableData()) {
				lst.add(data);
			}
			for( CFSecProtTableData data: TABLE_DATA) {
				lst.add(data);
			}
			CFSecProtTableData arr[] = new CFSecProtTableData[lst.size()];
			int idx = 0;
			for(CFSecProtTableData data: lst) {
				arr[idx++] = data;
			}
			consolidatedProtTableData.compareAndSet(null, arr);
		}
		return(consolidatedProtTableData.get());
	}

	public static CFSecProtRoleInfo[] getProtRoleInfo() {
		return ROLE_INFO;
	}

	public static CFSecProtRoleInfo[] getConsolidatedProtRoleInfo() {
		if (consolidatedProtRoleInfo.get() == null) {
			ArrayList<CFSecProtRoleInfo> lst = new ArrayList<>();
			for( CFSecProtRoleInfo info: ICFSecProtSchema.getRoleInfo()) {
				lst.add(info);
			}
			for( CFSecProtRoleInfo info: ICFIntProtSchema.getRoleInfo()) {
				lst.add(info);
			}
			for( CFSecProtRoleInfo info: ROLE_INFO) {
				lst.add(info);
			}
			// Dependency order is the natural order of role info comparison
			lst.sort(new CFSecProtRoleInfoDependencyComparator());
			CFSecProtRoleInfo arr[] = new CFSecProtRoleInfo[lst.size()];
			int idx = 0;
			for(CFSecProtRoleInfo info: lst) {
				arr[idx++] = info;
			}
			consolidatedProtRoleInfo.compareAndSet(null, arr);
		}
		return(consolidatedProtRoleInfo.get());
	}

	public default void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		arApplicationContext.compareAndSet(arApplicationContext.get(), applicationContext);
	}

	public static ApplicationContext getApplicationContext() {
		return( arApplicationContext.get() );
	}

		final static ArrayList<ICFSecProtSchema.ClassMapEntry> entries = new ArrayList<>();
		final static HashMap<Integer,ICFSecProtSchema.ClassMapEntry> mapBackingClassCodeToEntry = new HashMap<>();
		final static HashMap<Integer,ICFSecProtSchema.ClassMapEntry> mapRuntimeClassCodeToEntry = new HashMap<>();
		final static AtomicReference<ICFBamProtSchema> backingCFBamProtSchema = new AtomicReference<>();
	public enum LoaderBehaviourEnum {
		Insert,
		Update,
		Replace
	};

	static HashMap<String,LoaderBehaviourEnum> lookupLoaderBehaviourEnum = new HashMap<String,LoaderBehaviourEnum>();

	public static LoaderBehaviourEnum parseLoaderBehaviourEnum( String value ) {
		LoaderBehaviourEnum retval = parseLoaderBehaviourEnum( ICFBamProtSchema.class.getName(), value );
		return( retval );
	}

	public static LoaderBehaviourEnum parseLoaderBehaviourEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseLoaderBehaviourEnum";
		if( lookupLoaderBehaviourEnum.isEmpty() ) {
			lookupLoaderBehaviourEnum.put( "Insert", LoaderBehaviourEnum.Insert );
			lookupLoaderBehaviourEnum.put( "Update", LoaderBehaviourEnum.Update );
			lookupLoaderBehaviourEnum.put( "Replace", LoaderBehaviourEnum.Replace );
		}
		LoaderBehaviourEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupLoaderBehaviourEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	static HashMap<Integer,LoaderBehaviourEnum> lookupOrdinalLoaderBehaviourEnum = new HashMap<Integer,LoaderBehaviourEnum>();

	public static LoaderBehaviourEnum ordinalToLoaderBehaviourEnum( String fieldOrClassName, Short value ) {
		LoaderBehaviourEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToLoaderBehaviourEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static LoaderBehaviourEnum ordinalToLoaderBehaviourEnum( Short value ) {
		LoaderBehaviourEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToLoaderBehaviourEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static LoaderBehaviourEnum ordinalToLoaderBehaviourEnum( Integer value ) {
		LoaderBehaviourEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToLoaderBehaviourEnum( ICFBamProtSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static LoaderBehaviourEnum ordinalToLoaderBehaviourEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToLoaderBehaviourEnum";
		if( lookupOrdinalLoaderBehaviourEnum.isEmpty() ) {
			lookupOrdinalLoaderBehaviourEnum.put( Integer.valueOf( LoaderBehaviourEnum.Insert.ordinal() ), LoaderBehaviourEnum.Insert );
			lookupOrdinalLoaderBehaviourEnum.put( Integer.valueOf( LoaderBehaviourEnum.Update.ordinal() ), LoaderBehaviourEnum.Update );
			lookupOrdinalLoaderBehaviourEnum.put( Integer.valueOf( LoaderBehaviourEnum.Replace.ordinal() ), LoaderBehaviourEnum.Replace );
		}
		LoaderBehaviourEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalLoaderBehaviourEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	public enum RelationTypeEnum {
		Unknown,
		Lookup,
		Superclass,
		Container,
		Components,
		Owner,
		Parent,
		Children
	};

	static HashMap<String,RelationTypeEnum> lookupRelationTypeEnum = new HashMap<String,RelationTypeEnum>();

	public static RelationTypeEnum parseRelationTypeEnum( String value ) {
		RelationTypeEnum retval = parseRelationTypeEnum( ICFBamProtSchema.class.getName(), value );
		return( retval );
	}

	public static RelationTypeEnum parseRelationTypeEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseRelationTypeEnum";
		if( lookupRelationTypeEnum.isEmpty() ) {
			lookupRelationTypeEnum.put( "Unknown", RelationTypeEnum.Unknown );
			lookupRelationTypeEnum.put( "Lookup", RelationTypeEnum.Lookup );
			lookupRelationTypeEnum.put( "Superclass", RelationTypeEnum.Superclass );
			lookupRelationTypeEnum.put( "Container", RelationTypeEnum.Container );
			lookupRelationTypeEnum.put( "Components", RelationTypeEnum.Components );
			lookupRelationTypeEnum.put( "Owner", RelationTypeEnum.Owner );
			lookupRelationTypeEnum.put( "Parent", RelationTypeEnum.Parent );
			lookupRelationTypeEnum.put( "Children", RelationTypeEnum.Children );
		}
		RelationTypeEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupRelationTypeEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	static HashMap<Integer,RelationTypeEnum> lookupOrdinalRelationTypeEnum = new HashMap<Integer,RelationTypeEnum>();

	public static RelationTypeEnum ordinalToRelationTypeEnum( String fieldOrClassName, Short value ) {
		RelationTypeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRelationTypeEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RelationTypeEnum ordinalToRelationTypeEnum( Short value ) {
		RelationTypeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRelationTypeEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RelationTypeEnum ordinalToRelationTypeEnum( Integer value ) {
		RelationTypeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRelationTypeEnum( ICFBamProtSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RelationTypeEnum ordinalToRelationTypeEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToRelationTypeEnum";
		if( lookupOrdinalRelationTypeEnum.isEmpty() ) {
			lookupOrdinalRelationTypeEnum.put( Integer.valueOf( RelationTypeEnum.Unknown.ordinal() ), RelationTypeEnum.Unknown );
			lookupOrdinalRelationTypeEnum.put( Integer.valueOf( RelationTypeEnum.Lookup.ordinal() ), RelationTypeEnum.Lookup );
			lookupOrdinalRelationTypeEnum.put( Integer.valueOf( RelationTypeEnum.Superclass.ordinal() ), RelationTypeEnum.Superclass );
			lookupOrdinalRelationTypeEnum.put( Integer.valueOf( RelationTypeEnum.Container.ordinal() ), RelationTypeEnum.Container );
			lookupOrdinalRelationTypeEnum.put( Integer.valueOf( RelationTypeEnum.Components.ordinal() ), RelationTypeEnum.Components );
			lookupOrdinalRelationTypeEnum.put( Integer.valueOf( RelationTypeEnum.Owner.ordinal() ), RelationTypeEnum.Owner );
			lookupOrdinalRelationTypeEnum.put( Integer.valueOf( RelationTypeEnum.Parent.ordinal() ), RelationTypeEnum.Parent );
			lookupOrdinalRelationTypeEnum.put( Integer.valueOf( RelationTypeEnum.Children.ordinal() ), RelationTypeEnum.Children );
		}
		RelationTypeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalRelationTypeEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	public enum CodeVisibilityEnum {
		Public,
		Protected,
		Private
	};

	static HashMap<String,CodeVisibilityEnum> lookupCodeVisibilityEnum = new HashMap<String,CodeVisibilityEnum>();

	public static CodeVisibilityEnum parseCodeVisibilityEnum( String value ) {
		CodeVisibilityEnum retval = parseCodeVisibilityEnum( ICFBamProtSchema.class.getName(), value );
		return( retval );
	}

	public static CodeVisibilityEnum parseCodeVisibilityEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseCodeVisibilityEnum";
		if( lookupCodeVisibilityEnum.isEmpty() ) {
			lookupCodeVisibilityEnum.put( "Public", CodeVisibilityEnum.Public );
			lookupCodeVisibilityEnum.put( "Protected", CodeVisibilityEnum.Protected );
			lookupCodeVisibilityEnum.put( "Private", CodeVisibilityEnum.Private );
		}
		CodeVisibilityEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupCodeVisibilityEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	static HashMap<Integer,CodeVisibilityEnum> lookupOrdinalCodeVisibilityEnum = new HashMap<Integer,CodeVisibilityEnum>();

	public static CodeVisibilityEnum ordinalToCodeVisibilityEnum( String fieldOrClassName, Short value ) {
		CodeVisibilityEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToCodeVisibilityEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static CodeVisibilityEnum ordinalToCodeVisibilityEnum( Short value ) {
		CodeVisibilityEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToCodeVisibilityEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static CodeVisibilityEnum ordinalToCodeVisibilityEnum( Integer value ) {
		CodeVisibilityEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToCodeVisibilityEnum( ICFBamProtSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static CodeVisibilityEnum ordinalToCodeVisibilityEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToCodeVisibilityEnum";
		if( lookupOrdinalCodeVisibilityEnum.isEmpty() ) {
			lookupOrdinalCodeVisibilityEnum.put( Integer.valueOf( CodeVisibilityEnum.Public.ordinal() ), CodeVisibilityEnum.Public );
			lookupOrdinalCodeVisibilityEnum.put( Integer.valueOf( CodeVisibilityEnum.Protected.ordinal() ), CodeVisibilityEnum.Protected );
			lookupOrdinalCodeVisibilityEnum.put( Integer.valueOf( CodeVisibilityEnum.Private.ordinal() ), CodeVisibilityEnum.Private );
		}
		CodeVisibilityEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalCodeVisibilityEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	public enum SecScopeEnum {
		None,
		System,
		Cluster,
		Tenant,
		SystemGroup,
		ClusterGroup,
		TenantGroup
	};

	static HashMap<String,SecScopeEnum> lookupSecScopeEnum = new HashMap<String,SecScopeEnum>();

	public static SecScopeEnum parseSecScopeEnum( String value ) {
		SecScopeEnum retval = parseSecScopeEnum( ICFBamProtSchema.class.getName(), value );
		return( retval );
	}

	public static SecScopeEnum parseSecScopeEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseSecScopeEnum";
		if( lookupSecScopeEnum.isEmpty() ) {
			lookupSecScopeEnum.put( "None", SecScopeEnum.None );
			lookupSecScopeEnum.put( "System", SecScopeEnum.System );
			lookupSecScopeEnum.put( "Cluster", SecScopeEnum.Cluster );
			lookupSecScopeEnum.put( "Tenant", SecScopeEnum.Tenant );
			lookupSecScopeEnum.put( "SystemGroup", SecScopeEnum.SystemGroup );
			lookupSecScopeEnum.put( "ClusterGroup", SecScopeEnum.ClusterGroup );
			lookupSecScopeEnum.put( "TenantGroup", SecScopeEnum.TenantGroup );
		}
		SecScopeEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupSecScopeEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	static HashMap<Integer,SecScopeEnum> lookupOrdinalSecScopeEnum = new HashMap<Integer,SecScopeEnum>();

	public static SecScopeEnum ordinalToSecScopeEnum( String fieldOrClassName, Short value ) {
		SecScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToSecScopeEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static SecScopeEnum ordinalToSecScopeEnum( Short value ) {
		SecScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToSecScopeEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static SecScopeEnum ordinalToSecScopeEnum( Integer value ) {
		SecScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToSecScopeEnum( ICFBamProtSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static SecScopeEnum ordinalToSecScopeEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToSecScopeEnum";
		if( lookupOrdinalSecScopeEnum.isEmpty() ) {
			lookupOrdinalSecScopeEnum.put( Integer.valueOf( SecScopeEnum.None.ordinal() ), SecScopeEnum.None );
			lookupOrdinalSecScopeEnum.put( Integer.valueOf( SecScopeEnum.System.ordinal() ), SecScopeEnum.System );
			lookupOrdinalSecScopeEnum.put( Integer.valueOf( SecScopeEnum.Cluster.ordinal() ), SecScopeEnum.Cluster );
			lookupOrdinalSecScopeEnum.put( Integer.valueOf( SecScopeEnum.Tenant.ordinal() ), SecScopeEnum.Tenant );
			lookupOrdinalSecScopeEnum.put( Integer.valueOf( SecScopeEnum.SystemGroup.ordinal() ), SecScopeEnum.SystemGroup );
			lookupOrdinalSecScopeEnum.put( Integer.valueOf( SecScopeEnum.ClusterGroup.ordinal() ), SecScopeEnum.ClusterGroup );
			lookupOrdinalSecScopeEnum.put( Integer.valueOf( SecScopeEnum.TenantGroup.ordinal() ), SecScopeEnum.TenantGroup );
		}
		SecScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalSecScopeEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	public enum RoleScopeEnum {
		SysRole,
		ClusRole,
		TentRole
	};

	static HashMap<String,RoleScopeEnum> lookupRoleScopeEnum = new HashMap<String,RoleScopeEnum>();

	public static RoleScopeEnum parseRoleScopeEnum( String value ) {
		RoleScopeEnum retval = parseRoleScopeEnum( ICFBamProtSchema.class.getName(), value );
		return( retval );
	}

	public static RoleScopeEnum parseRoleScopeEnum( String fieldOrClassName, String value ) {
		final String S_ProcName = "parseRoleScopeEnum";
		if( lookupRoleScopeEnum.isEmpty() ) {
			lookupRoleScopeEnum.put( "SysRole", RoleScopeEnum.SysRole );
			lookupRoleScopeEnum.put( "ClusRole", RoleScopeEnum.ClusRole );
			lookupRoleScopeEnum.put( "TentRole", RoleScopeEnum.TentRole );
		}
		RoleScopeEnum retval;
		if( ( value == null ) || ( value.length() <= 0 ) ) {
			retval = null;
		}
		else {
			retval = lookupRoleScopeEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

	static HashMap<Integer,RoleScopeEnum> lookupOrdinalRoleScopeEnum = new HashMap<Integer,RoleScopeEnum>();

	public static RoleScopeEnum ordinalToRoleScopeEnum( String fieldOrClassName, Short value ) {
		RoleScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRoleScopeEnum( fieldOrClassName, Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RoleScopeEnum ordinalToRoleScopeEnum( Short value ) {
		RoleScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRoleScopeEnum( Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RoleScopeEnum ordinalToRoleScopeEnum( Integer value ) {
		RoleScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = ordinalToRoleScopeEnum( ICFBamProtSchema.class.getName(), Integer.valueOf( value.shortValue() ) );
		}
		return( retval );
	}

	public static RoleScopeEnum ordinalToRoleScopeEnum( String fieldOrClassName, Integer value ) {
		final String S_ProcName = "ordinalToRoleScopeEnum";
		if( lookupOrdinalRoleScopeEnum.isEmpty() ) {
			lookupOrdinalRoleScopeEnum.put( Integer.valueOf( RoleScopeEnum.SysRole.ordinal() ), RoleScopeEnum.SysRole );
			lookupOrdinalRoleScopeEnum.put( Integer.valueOf( RoleScopeEnum.ClusRole.ordinal() ), RoleScopeEnum.ClusRole );
			lookupOrdinalRoleScopeEnum.put( Integer.valueOf( RoleScopeEnum.TentRole.ordinal() ), RoleScopeEnum.TentRole );
		}
		RoleScopeEnum retval;
		if( value == null ) {
			retval = null;
		}
		else {
			retval = lookupOrdinalRoleScopeEnum.get( value );
			if( retval == null ) {
				throw new CFLibInvalidArgumentException( fieldOrClassName,
					fieldOrClassName,
					S_ProcName,
					2,
					"value",
					"Invalid enum limb argument " + value,
					"Invalid enum limb argument " + value);
			}
		}
		return( retval );
	}

		public static ICFBamProtSchema getBackingCFBamProtSchema() {
			return( ICFBamProtSchema.backingCFBamProtSchema.get() );
		}
		
		public static void setBackingCFBamProtSchema(ICFBamProtSchema backingSchema) {
			ICFBamProtSchema.backingCFBamProtSchema.set(backingSchema);
		}
		
		public ICFBamProtSchema getCFBamProtSchema();
		public void setCFBamProtSchema(ICFBamProtSchema schema);
		
		public static int doInitClassMapEntries(int value) {
			value = ICFSecProtSchema.doInitClassMapEntries(value);
			value = ICFIntProtSchema.doInitClassMapEntries(value);
			if (ICFBamProtSchema.entries.isEmpty()) {
				ICFSecProtSchema.ClassMapEntry entry;
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Atom", ICFBamProtAtom.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "BlobCol", ICFBamProtBlobCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "BlobDef", ICFBamProtBlobDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "BlobType", ICFBamProtBlobType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "BoolCol", ICFBamProtBoolCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "BoolDef", ICFBamProtBoolDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "BoolType", ICFBamProtBoolType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Chain", ICFBamProtChain.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ClearDep", ICFBamProtClearDep.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ClearSubDep1", ICFBamProtClearSubDep1.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ClearSubDep2", ICFBamProtClearSubDep2.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ClearSubDep3", ICFBamProtClearSubDep3.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ClearTopDep", ICFBamProtClearTopDep.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DateCol", ICFBamProtDateCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DateDef", ICFBamProtDateDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DateType", ICFBamProtDateType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash128Col", ICFBamProtDbKeyHash128Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash128Def", ICFBamProtDbKeyHash128Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash128Gen", ICFBamProtDbKeyHash128Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash128Type", ICFBamProtDbKeyHash128Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash160Col", ICFBamProtDbKeyHash160Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash160Def", ICFBamProtDbKeyHash160Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash160Gen", ICFBamProtDbKeyHash160Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash160Type", ICFBamProtDbKeyHash160Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash224Col", ICFBamProtDbKeyHash224Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash224Def", ICFBamProtDbKeyHash224Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash224Gen", ICFBamProtDbKeyHash224Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash224Type", ICFBamProtDbKeyHash224Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash256Col", ICFBamProtDbKeyHash256Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash256Def", ICFBamProtDbKeyHash256Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash256Gen", ICFBamProtDbKeyHash256Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash256Type", ICFBamProtDbKeyHash256Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash384Col", ICFBamProtDbKeyHash384Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash384Def", ICFBamProtDbKeyHash384Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash384Gen", ICFBamProtDbKeyHash384Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash384Type", ICFBamProtDbKeyHash384Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash512Col", ICFBamProtDbKeyHash512Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash512Def", ICFBamProtDbKeyHash512Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash512Gen", ICFBamProtDbKeyHash512Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DbKeyHash512Type", ICFBamProtDbKeyHash512Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DelDep", ICFBamProtDelDep.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DelSubDep1", ICFBamProtDelSubDep1.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DelSubDep2", ICFBamProtDelSubDep2.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DelSubDep3", ICFBamProtDelSubDep3.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DelTopDep", ICFBamProtDelTopDep.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DoubleCol", ICFBamProtDoubleCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DoubleDef", ICFBamProtDoubleDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "DoubleType", ICFBamProtDoubleType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "EnumDef", ICFBamProtEnumDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "EnumTag", ICFBamProtEnumTag.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "EnumType", ICFBamProtEnumType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "FloatCol", ICFBamProtFloatCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "FloatDef", ICFBamProtFloatDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "FloatType", ICFBamProtFloatType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Id16Gen", ICFBamProtId16Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Id32Gen", ICFBamProtId32Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Id64Gen", ICFBamProtId64Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Index", ICFBamProtIndex.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "IndexCol", ICFBamProtIndexCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "IndexTweak", ICFBamProtIndexTweak.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int16Col", ICFBamProtInt16Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int16Def", ICFBamProtInt16Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int16Type", ICFBamProtInt16Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int32Col", ICFBamProtInt32Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int32Def", ICFBamProtInt32Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int32Type", ICFBamProtInt32Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int64Col", ICFBamProtInt64Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int64Def", ICFBamProtInt64Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Int64Type", ICFBamProtInt64Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NmTokenCol", ICFBamProtNmTokenCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NmTokenDef", ICFBamProtNmTokenDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NmTokenType", ICFBamProtNmTokenType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NmTokensCol", ICFBamProtNmTokensCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NmTokensDef", ICFBamProtNmTokensDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NmTokensType", ICFBamProtNmTokensType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NumberCol", ICFBamProtNumberCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NumberDef", ICFBamProtNumberDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "NumberType", ICFBamProtNumberType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Param", ICFBamProtParam.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "PopDep", ICFBamProtPopDep.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "PopSubDep1", ICFBamProtPopSubDep1.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "PopSubDep2", ICFBamProtPopSubDep2.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "PopSubDep3", ICFBamProtPopSubDep3.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "PopTopDep", ICFBamProtPopTopDep.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Relation", ICFBamProtRelation.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "RelationCol", ICFBamProtRelationCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "RoleDef", ICFBamProtRoleDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "SchemaDef", ICFBamProtSchemaDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "SchemaRef", ICFBamProtSchemaRef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "SchemaRole", ICFBamProtSchemaRole.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "SchemaTweak", ICFBamProtSchemaTweak.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Scope", ICFBamProtScope.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ServerListFunc", ICFBamProtServerListFunc.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ServerMethod", ICFBamProtServerMethod.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ServerObjFunc", ICFBamProtServerObjFunc.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "ServerProc", ICFBamProtServerProc.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "StringCol", ICFBamProtStringCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "StringDef", ICFBamProtStringDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "StringType", ICFBamProtStringType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZDateCol", ICFBamProtTZDateCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZDateDef", ICFBamProtTZDateDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZDateType", ICFBamProtTZDateType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZTimeCol", ICFBamProtTZTimeCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZTimeDef", ICFBamProtTZTimeDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZTimeType", ICFBamProtTZTimeType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZTimestampCol", ICFBamProtTZTimestampCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZTimestampDef", ICFBamProtTZTimestampDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TZTimestampType", ICFBamProtTZTimestampType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Table", ICFBamProtTable.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TableCol", ICFBamProtTableCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TableTweak", ICFBamProtTableTweak.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TextCol", ICFBamProtTextCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TextDef", ICFBamProtTextDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TextType", ICFBamProtTextType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TimeCol", ICFBamProtTimeCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TimeDef", ICFBamProtTimeDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TimeType", ICFBamProtTimeType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TimestampCol", ICFBamProtTimestampCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TimestampDef", ICFBamProtTimestampDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TimestampType", ICFBamProtTimestampType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TokenCol", ICFBamProtTokenCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TokenDef", ICFBamProtTokenDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "TokenType", ICFBamProtTokenType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Tweak", ICFBamProtTweak.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt16Col", ICFBamProtUInt16Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt16Def", ICFBamProtUInt16Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt16Type", ICFBamProtUInt16Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt32Col", ICFBamProtUInt32Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt32Def", ICFBamProtUInt32Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt32Type", ICFBamProtUInt32Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt64Col", ICFBamProtUInt64Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt64Def", ICFBamProtUInt64Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UInt64Type", ICFBamProtUInt64Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Uuid6Col", ICFBamProtUuid6Col.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Uuid6Def", ICFBamProtUuid6Def.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Uuid6Gen", ICFBamProtUuid6Gen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Uuid6Type", ICFBamProtUuid6Type.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UuidCol", ICFBamProtUuidCol.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UuidDef", ICFBamProtUuidDef.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UuidGen", ICFBamProtUuidGen.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "UuidType", ICFBamProtUuidType.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				entry = new ICFSecProtSchema.ClassMapEntry(ICFBamProtSchema.SCHEMA_NAME, "Value", ICFBamProtValue.CLASS_CODE);
				ICFBamProtSchema.entries.add(entry);
				for( ICFSecProtSchema.ClassMapEntry cur: ICFBamProtSchema.entries) {
					cur.setRuntimeClassCode(value++);
				}
				ICFBamProtSchema.mapBackingClassCodeToEntry.clear();
				ICFBamProtSchema.mapRuntimeClassCodeToEntry.clear();
				for( ICFSecProtSchema.ClassMapEntry cur: ICFBamProtSchema.entries) {
					ICFBamProtSchema.mapBackingClassCodeToEntry.put(cur.getBackingClassCode(), cur);
					ICFBamProtSchema.mapRuntimeClassCodeToEntry.put(cur.getRuntimeClassCode(), cur);
				}
			}
			return(value);
		}
		
		public static ICFSecProtSchema.ClassMapEntry getClassMapByBackingClassCode(int code) {
			ICFSecProtSchema.ClassMapEntry entry;
			entry = ICFSecProtSchema.mapBackingClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			entry = ICFIntProtSchema.mapBackingClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			entry = ICFBamProtSchema.mapBackingClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			return( null );
		}
		
		public static ICFSecProtSchema.ClassMapEntry getClassMapByRuntimeClassCode(int code) {
			ICFSecProtSchema.ClassMapEntry entry;
			entry = ICFSecProtSchema.mapRuntimeClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			entry = ICFIntProtSchema.mapRuntimeClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			entry = ICFBamProtSchema.mapRuntimeClassCodeToEntry.get(code);
			if (entry != null) {
				return( entry );
			}
			return( null );
		}
		
		public int initClassMapEntries(int value);
		public void wireRecConstructors();
		public void wireTableTableInstances();

	/**
	 *	Allocate a new schema instance.
	 *
	 *	@return	A new ICFSecProtSchema instance.
	 */
	public ICFSecProtSchema newSchema();

	/**
	 *	Get the next ISOCcyIdGen identifier.
	 *
	 *	@return	The next ISOCcyIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOCcyIdGen();

	/**
	 *	Get the next ISOCtryIdGen identifier.
	 *
	 *	@return	The next ISOCtryIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOCtryIdGen();

	/**
	 *	Get the next ISOLangIdGen identifier.
	 *
	 *	@return	The next ISOLangIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOLangIdGen();

	/**
	 *	Get the next ISOTZoneIdGen identifier.
	 *
	 *	@return	The next ISOTZoneIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public short nextISOTZoneIdGen();

	/**
	 *	Get the next TableInfoIdGen identifier.
	 *
	 *	@return	The next TableInfoIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public int nextTableInfoIdGen();

	/**
	 *	Get the next MimeTypeIdGen identifier.
	 *
	 *	@return	The next MimeTypeIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public int nextMimeTypeIdGen();

	/**
	 *	Get the next URLProtocolIdGen identifier.
	 *
	 *	@return	The next URLProtocolIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public int nextURLProtocolIdGen();

	/**
	 *	Get the next ClusterIdGen identifier.
	 *
	 *	@return	The next ClusterIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextClusterIdGen();

	/**
	 *	Get the next SecSessionIdGen identifier.
	 *
	 *	@return	The next SecSessionIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextSecSessionIdGen();

	/**
	 *	Get the next SecUserIdGen identifier.
	 *
	 *	@return	The next SecUserIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextSecUserIdGen();

	/**
	 *	Get the next TenantIdGen identifier.
	 *
	 *	@return	The next TenantIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextTenantIdGen();

	/**
	 *	Get the next SecSysGrpIdGen identifier.
	 *
	 *	@return	The next SecSysGrpIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextSecSysGrpIdGen();

	/**
	 *	Get the next SecClusGrpIdGen identifier.
	 *
	 *	@return	The next SecClusGrpIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextSecClusGrpIdGen();

	/**
	 *	Get the next SecClusRoleIdGen identifier.
	 *
	 *	@return	The next SecClusRoleIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextSecClusRoleIdGen();

	/**
	 *	Get the next SecTentGrpIdGen identifier.
	 *
	 *	@return	The next SecTentGrpIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextSecTentGrpIdGen();

	/**
	 *	Get the next SecTentRoleIdGen identifier.
	 *
	 *	@return	The next SecTentRoleIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextSecTentRoleIdGen();

	/**
	 *	Get the next MajorVersionIdGen identifier.
	 *
	 *	@return	The next MajorVersionIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextMajorVersionIdGen();

	/**
	 *	Get the next MinorVersionIdGen identifier.
	 *
	 *	@return	The next MinorVersionIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextMinorVersionIdGen();

	/**
	 *	Get the next SubProjectIdGen identifier.
	 *
	 *	@return	The next SubProjectIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextSubProjectIdGen();

	/**
	 *	Get the next TldIdGen identifier.
	 *
	 *	@return	The next TldIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextTldIdGen();

	/**
	 *	Get the next TopDomainIdGen identifier.
	 *
	 *	@return	The next TopDomainIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextTopDomainIdGen();

	/**
	 *	Get the next TopProjectIdGen identifier.
	 *
	 *	@return	The next TopProjectIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextTopProjectIdGen();

	/**
	 *	Get the next LicenseIdGen identifier.
	 *
	 *	@return	The next LicenseIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextLicenseIdGen();

	/**
	 *	Get the next ChainIdGen identifier.
	 *
	 *	@return	The next ChainIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextChainIdGen();

	/**
	 *	Get the next EnumTagIdGen identifier.
	 *
	 *	@return	The next EnumTagIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextEnumTagIdGen();

	/**
	 *	Get the next IndexColIdGen identifier.
	 *
	 *	@return	The next IndexColIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextIndexColIdGen();

	/**
	 *	Get the next ParamIdGen identifier.
	 *
	 *	@return	The next ParamIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextParamIdGen();

	/**
	 *	Get the next RelationColIdGen identifier.
	 *
	 *	@return	The next RelationColIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextRelationColIdGen();

	/**
	 *	Get the next TweakIdGen identifier.
	 *
	 *	@return	The next TweakIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextTweakIdGen();

	/**
	 *	Get the next ScopeIdGen identifier.
	 *
	 *	@return	The next ScopeIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextScopeIdGen();

	/**
	 *	Get the next ValueIdGen identifier.
	 *
	 *	@return	The next ValueIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextValueIdGen();

	/**
	 *	Get the next RoleIdGen identifier.
	 *
	 *	@return	The next RoleIdGen identifier.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public CFLibDbKeyHash256 nextRoleIdGen();

	/**
	 *	Get the factory for CFSecProt data objects.
	 */
	// public ICFSecProtFactory getCFSecProtFactory();

	/**
	 *	Get the buffer factory for CFSecProt data buffers.
	 */
	// public CFSecProtBuffFactoryService getCFSecProtBuffFactory();

	/**
	 *	Get the factory for CFIntProt data objects.
	 */
	// public ICFIntProtFactory getCFIntProtFactory();

	/**
	 *	Get the buffer factory for CFIntProt data buffers.
	 */
	// public CFIntProtBuffFactoryService getCFIntProtBuffFactory();

	/**
	 *	Get the factory for CFBamProt data objects.
	 */
	// public ICFBamProtFactory getCFBamProtFactory();

	/**
	 *	Get the buffer factory for CFBamProt data buffers.
	 */
	// public CFBamProtBuffFactoryService getCFBamProtBuffFactory();

	/**
	 *	Get the Atom Table interface for the schema.
	 *
	 *	@return	The Atom Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtAtomTable getTableAtom();

	/**
	 *	Get the BlobCol Table interface for the schema.
	 *
	 *	@return	The BlobCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBlobColTable getTableBlobCol();

	/**
	 *	Get the BlobDef Table interface for the schema.
	 *
	 *	@return	The BlobDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBlobDefTable getTableBlobDef();

	/**
	 *	Get the BlobType Table interface for the schema.
	 *
	 *	@return	The BlobType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBlobTypeTable getTableBlobType();

	/**
	 *	Get the BoolCol Table interface for the schema.
	 *
	 *	@return	The BoolCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolColTable getTableBoolCol();

	/**
	 *	Get the BoolDef Table interface for the schema.
	 *
	 *	@return	The BoolDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolDefTable getTableBoolDef();

	/**
	 *	Get the BoolType Table interface for the schema.
	 *
	 *	@return	The BoolType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtBoolTypeTable getTableBoolType();

	/**
	 *	Get the Chain Table interface for the schema.
	 *
	 *	@return	The Chain Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtChainTable getTableChain();

	/**
	 *	Get the ClearDep Table interface for the schema.
	 *
	 *	@return	The ClearDep Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtClearDepTable getTableClearDep();

	/**
	 *	Get the ClearSubDep1 Table interface for the schema.
	 *
	 *	@return	The ClearSubDep1 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtClearSubDep1Table getTableClearSubDep1();

	/**
	 *	Get the ClearSubDep2 Table interface for the schema.
	 *
	 *	@return	The ClearSubDep2 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtClearSubDep2Table getTableClearSubDep2();

	/**
	 *	Get the ClearSubDep3 Table interface for the schema.
	 *
	 *	@return	The ClearSubDep3 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtClearSubDep3Table getTableClearSubDep3();

	/**
	 *	Get the ClearTopDep Table interface for the schema.
	 *
	 *	@return	The ClearTopDep Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtClearTopDepTable getTableClearTopDep();

	/**
	 *	Get the DateCol Table interface for the schema.
	 *
	 *	@return	The DateCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDateColTable getTableDateCol();

	/**
	 *	Get the DateDef Table interface for the schema.
	 *
	 *	@return	The DateDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDateDefTable getTableDateDef();

	/**
	 *	Get the DateType Table interface for the schema.
	 *
	 *	@return	The DateType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDateTypeTable getTableDateType();

	/**
	 *	Get the DbKeyHash128Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash128Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash128ColTable getTableDbKeyHash128Col();

	/**
	 *	Get the DbKeyHash128Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash128Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash128DefTable getTableDbKeyHash128Def();

	/**
	 *	Get the DbKeyHash128Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash128Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash128GenTable getTableDbKeyHash128Gen();

	/**
	 *	Get the DbKeyHash128Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash128Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash128TypeTable getTableDbKeyHash128Type();

	/**
	 *	Get the DbKeyHash160Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash160Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash160ColTable getTableDbKeyHash160Col();

	/**
	 *	Get the DbKeyHash160Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash160Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash160DefTable getTableDbKeyHash160Def();

	/**
	 *	Get the DbKeyHash160Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash160Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash160GenTable getTableDbKeyHash160Gen();

	/**
	 *	Get the DbKeyHash160Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash160Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash160TypeTable getTableDbKeyHash160Type();

	/**
	 *	Get the DbKeyHash224Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash224Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash224ColTable getTableDbKeyHash224Col();

	/**
	 *	Get the DbKeyHash224Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash224Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash224DefTable getTableDbKeyHash224Def();

	/**
	 *	Get the DbKeyHash224Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash224Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash224GenTable getTableDbKeyHash224Gen();

	/**
	 *	Get the DbKeyHash224Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash224Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash224TypeTable getTableDbKeyHash224Type();

	/**
	 *	Get the DbKeyHash256Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash256Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash256ColTable getTableDbKeyHash256Col();

	/**
	 *	Get the DbKeyHash256Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash256Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash256DefTable getTableDbKeyHash256Def();

	/**
	 *	Get the DbKeyHash256Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash256Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash256GenTable getTableDbKeyHash256Gen();

	/**
	 *	Get the DbKeyHash256Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash256Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash256TypeTable getTableDbKeyHash256Type();

	/**
	 *	Get the DbKeyHash384Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash384Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash384ColTable getTableDbKeyHash384Col();

	/**
	 *	Get the DbKeyHash384Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash384Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash384DefTable getTableDbKeyHash384Def();

	/**
	 *	Get the DbKeyHash384Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash384Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash384GenTable getTableDbKeyHash384Gen();

	/**
	 *	Get the DbKeyHash384Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash384Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash384TypeTable getTableDbKeyHash384Type();

	/**
	 *	Get the DbKeyHash512Col Table interface for the schema.
	 *
	 *	@return	The DbKeyHash512Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash512ColTable getTableDbKeyHash512Col();

	/**
	 *	Get the DbKeyHash512Def Table interface for the schema.
	 *
	 *	@return	The DbKeyHash512Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash512DefTable getTableDbKeyHash512Def();

	/**
	 *	Get the DbKeyHash512Gen Table interface for the schema.
	 *
	 *	@return	The DbKeyHash512Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash512GenTable getTableDbKeyHash512Gen();

	/**
	 *	Get the DbKeyHash512Type Table interface for the schema.
	 *
	 *	@return	The DbKeyHash512Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDbKeyHash512TypeTable getTableDbKeyHash512Type();

	/**
	 *	Get the DelDep Table interface for the schema.
	 *
	 *	@return	The DelDep Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDelDepTable getTableDelDep();

	/**
	 *	Get the DelSubDep1 Table interface for the schema.
	 *
	 *	@return	The DelSubDep1 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDelSubDep1Table getTableDelSubDep1();

	/**
	 *	Get the DelSubDep2 Table interface for the schema.
	 *
	 *	@return	The DelSubDep2 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDelSubDep2Table getTableDelSubDep2();

	/**
	 *	Get the DelSubDep3 Table interface for the schema.
	 *
	 *	@return	The DelSubDep3 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDelSubDep3Table getTableDelSubDep3();

	/**
	 *	Get the DelTopDep Table interface for the schema.
	 *
	 *	@return	The DelTopDep Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDelTopDepTable getTableDelTopDep();

	/**
	 *	Get the DoubleCol Table interface for the schema.
	 *
	 *	@return	The DoubleCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleColTable getTableDoubleCol();

	/**
	 *	Get the DoubleDef Table interface for the schema.
	 *
	 *	@return	The DoubleDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleDefTable getTableDoubleDef();

	/**
	 *	Get the DoubleType Table interface for the schema.
	 *
	 *	@return	The DoubleType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtDoubleTypeTable getTableDoubleType();

	/**
	 *	Get the EnumDef Table interface for the schema.
	 *
	 *	@return	The EnumDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtEnumDefTable getTableEnumDef();

	/**
	 *	Get the EnumTag Table interface for the schema.
	 *
	 *	@return	The EnumTag Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtEnumTagTable getTableEnumTag();

	/**
	 *	Get the EnumType Table interface for the schema.
	 *
	 *	@return	The EnumType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtEnumTypeTable getTableEnumType();

	/**
	 *	Get the FloatCol Table interface for the schema.
	 *
	 *	@return	The FloatCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtFloatColTable getTableFloatCol();

	/**
	 *	Get the FloatDef Table interface for the schema.
	 *
	 *	@return	The FloatDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtFloatDefTable getTableFloatDef();

	/**
	 *	Get the FloatType Table interface for the schema.
	 *
	 *	@return	The FloatType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtFloatTypeTable getTableFloatType();

	/**
	 *	Get the Id16Gen Table interface for the schema.
	 *
	 *	@return	The Id16Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtId16GenTable getTableId16Gen();

	/**
	 *	Get the Id32Gen Table interface for the schema.
	 *
	 *	@return	The Id32Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtId32GenTable getTableId32Gen();

	/**
	 *	Get the Id64Gen Table interface for the schema.
	 *
	 *	@return	The Id64Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtId64GenTable getTableId64Gen();

	/**
	 *	Get the Index Table interface for the schema.
	 *
	 *	@return	The Index Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtIndexTable getTableIndex();

	/**
	 *	Get the IndexCol Table interface for the schema.
	 *
	 *	@return	The IndexCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtIndexColTable getTableIndexCol();

	/**
	 *	Get the IndexTweak Table interface for the schema.
	 *
	 *	@return	The IndexTweak Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtIndexTweakTable getTableIndexTweak();

	/**
	 *	Get the Int16Col Table interface for the schema.
	 *
	 *	@return	The Int16Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt16ColTable getTableInt16Col();

	/**
	 *	Get the Int16Def Table interface for the schema.
	 *
	 *	@return	The Int16Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt16DefTable getTableInt16Def();

	/**
	 *	Get the Int16Type Table interface for the schema.
	 *
	 *	@return	The Int16Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt16TypeTable getTableInt16Type();

	/**
	 *	Get the Int32Col Table interface for the schema.
	 *
	 *	@return	The Int32Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt32ColTable getTableInt32Col();

	/**
	 *	Get the Int32Def Table interface for the schema.
	 *
	 *	@return	The Int32Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt32DefTable getTableInt32Def();

	/**
	 *	Get the Int32Type Table interface for the schema.
	 *
	 *	@return	The Int32Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt32TypeTable getTableInt32Type();

	/**
	 *	Get the Int64Col Table interface for the schema.
	 *
	 *	@return	The Int64Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64ColTable getTableInt64Col();

	/**
	 *	Get the Int64Def Table interface for the schema.
	 *
	 *	@return	The Int64Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64DefTable getTableInt64Def();

	/**
	 *	Get the Int64Type Table interface for the schema.
	 *
	 *	@return	The Int64Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtInt64TypeTable getTableInt64Type();

	/**
	 *	Get the NmTokenCol Table interface for the schema.
	 *
	 *	@return	The NmTokenCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNmTokenColTable getTableNmTokenCol();

	/**
	 *	Get the NmTokenDef Table interface for the schema.
	 *
	 *	@return	The NmTokenDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNmTokenDefTable getTableNmTokenDef();

	/**
	 *	Get the NmTokenType Table interface for the schema.
	 *
	 *	@return	The NmTokenType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNmTokenTypeTable getTableNmTokenType();

	/**
	 *	Get the NmTokensCol Table interface for the schema.
	 *
	 *	@return	The NmTokensCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNmTokensColTable getTableNmTokensCol();

	/**
	 *	Get the NmTokensDef Table interface for the schema.
	 *
	 *	@return	The NmTokensDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNmTokensDefTable getTableNmTokensDef();

	/**
	 *	Get the NmTokensType Table interface for the schema.
	 *
	 *	@return	The NmTokensType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNmTokensTypeTable getTableNmTokensType();

	/**
	 *	Get the NumberCol Table interface for the schema.
	 *
	 *	@return	The NumberCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNumberColTable getTableNumberCol();

	/**
	 *	Get the NumberDef Table interface for the schema.
	 *
	 *	@return	The NumberDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNumberDefTable getTableNumberDef();

	/**
	 *	Get the NumberType Table interface for the schema.
	 *
	 *	@return	The NumberType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtNumberTypeTable getTableNumberType();

	/**
	 *	Get the Param Table interface for the schema.
	 *
	 *	@return	The Param Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtParamTable getTableParam();

	/**
	 *	Get the PopDep Table interface for the schema.
	 *
	 *	@return	The PopDep Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtPopDepTable getTablePopDep();

	/**
	 *	Get the PopSubDep1 Table interface for the schema.
	 *
	 *	@return	The PopSubDep1 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtPopSubDep1Table getTablePopSubDep1();

	/**
	 *	Get the PopSubDep2 Table interface for the schema.
	 *
	 *	@return	The PopSubDep2 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtPopSubDep2Table getTablePopSubDep2();

	/**
	 *	Get the PopSubDep3 Table interface for the schema.
	 *
	 *	@return	The PopSubDep3 Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtPopSubDep3Table getTablePopSubDep3();

	/**
	 *	Get the PopTopDep Table interface for the schema.
	 *
	 *	@return	The PopTopDep Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtPopTopDepTable getTablePopTopDep();

	/**
	 *	Get the Relation Table interface for the schema.
	 *
	 *	@return	The Relation Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtRelationTable getTableRelation();

	/**
	 *	Get the RelationCol Table interface for the schema.
	 *
	 *	@return	The RelationCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtRelationColTable getTableRelationCol();

	/**
	 *	Get the RoleDef Table interface for the schema.
	 *
	 *	@return	The RoleDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtRoleDefTable getTableRoleDef();

	/**
	 *	Get the SchemaDef Table interface for the schema.
	 *
	 *	@return	The SchemaDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtSchemaDefTable getTableSchemaDef();

	/**
	 *	Get the SchemaRef Table interface for the schema.
	 *
	 *	@return	The SchemaRef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtSchemaRefTable getTableSchemaRef();

	/**
	 *	Get the SchemaRole Table interface for the schema.
	 *
	 *	@return	The SchemaRole Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtSchemaRoleTable getTableSchemaRole();

	/**
	 *	Get the SchemaTweak Table interface for the schema.
	 *
	 *	@return	The SchemaTweak Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtSchemaTweakTable getTableSchemaTweak();

	/**
	 *	Get the Scope Table interface for the schema.
	 *
	 *	@return	The Scope Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtScopeTable getTableScope();

	/**
	 *	Get the ServerListFunc Table interface for the schema.
	 *
	 *	@return	The ServerListFunc Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtServerListFuncTable getTableServerListFunc();

	/**
	 *	Get the ServerMethod Table interface for the schema.
	 *
	 *	@return	The ServerMethod Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtServerMethodTable getTableServerMethod();

	/**
	 *	Get the ServerObjFunc Table interface for the schema.
	 *
	 *	@return	The ServerObjFunc Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtServerObjFuncTable getTableServerObjFunc();

	/**
	 *	Get the ServerProc Table interface for the schema.
	 *
	 *	@return	The ServerProc Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtServerProcTable getTableServerProc();

	/**
	 *	Get the StringCol Table interface for the schema.
	 *
	 *	@return	The StringCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtStringColTable getTableStringCol();

	/**
	 *	Get the StringDef Table interface for the schema.
	 *
	 *	@return	The StringDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtStringDefTable getTableStringDef();

	/**
	 *	Get the StringType Table interface for the schema.
	 *
	 *	@return	The StringType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtStringTypeTable getTableStringType();

	/**
	 *	Get the TZDateCol Table interface for the schema.
	 *
	 *	@return	The TZDateCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateColTable getTableTZDateCol();

	/**
	 *	Get the TZDateDef Table interface for the schema.
	 *
	 *	@return	The TZDateDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateDefTable getTableTZDateDef();

	/**
	 *	Get the TZDateType Table interface for the schema.
	 *
	 *	@return	The TZDateType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZDateTypeTable getTableTZDateType();

	/**
	 *	Get the TZTimeCol Table interface for the schema.
	 *
	 *	@return	The TZTimeCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZTimeColTable getTableTZTimeCol();

	/**
	 *	Get the TZTimeDef Table interface for the schema.
	 *
	 *	@return	The TZTimeDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZTimeDefTable getTableTZTimeDef();

	/**
	 *	Get the TZTimeType Table interface for the schema.
	 *
	 *	@return	The TZTimeType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZTimeTypeTable getTableTZTimeType();

	/**
	 *	Get the TZTimestampCol Table interface for the schema.
	 *
	 *	@return	The TZTimestampCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZTimestampColTable getTableTZTimestampCol();

	/**
	 *	Get the TZTimestampDef Table interface for the schema.
	 *
	 *	@return	The TZTimestampDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZTimestampDefTable getTableTZTimestampDef();

	/**
	 *	Get the TZTimestampType Table interface for the schema.
	 *
	 *	@return	The TZTimestampType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTZTimestampTypeTable getTableTZTimestampType();

	/**
	 *	Get the Table Table interface for the schema.
	 *
	 *	@return	The Table Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTableTable getTableTable();

	/**
	 *	Get the TableCol Table interface for the schema.
	 *
	 *	@return	The TableCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTableColTable getTableTableCol();

	/**
	 *	Get the TableTweak Table interface for the schema.
	 *
	 *	@return	The TableTweak Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTableTweakTable getTableTableTweak();

	/**
	 *	Get the TextCol Table interface for the schema.
	 *
	 *	@return	The TextCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTextColTable getTableTextCol();

	/**
	 *	Get the TextDef Table interface for the schema.
	 *
	 *	@return	The TextDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTextDefTable getTableTextDef();

	/**
	 *	Get the TextType Table interface for the schema.
	 *
	 *	@return	The TextType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTextTypeTable getTableTextType();

	/**
	 *	Get the TimeCol Table interface for the schema.
	 *
	 *	@return	The TimeCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeColTable getTableTimeCol();

	/**
	 *	Get the TimeDef Table interface for the schema.
	 *
	 *	@return	The TimeDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeDefTable getTableTimeDef();

	/**
	 *	Get the TimeType Table interface for the schema.
	 *
	 *	@return	The TimeType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimeTypeTable getTableTimeType();

	/**
	 *	Get the TimestampCol Table interface for the schema.
	 *
	 *	@return	The TimestampCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimestampColTable getTableTimestampCol();

	/**
	 *	Get the TimestampDef Table interface for the schema.
	 *
	 *	@return	The TimestampDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimestampDefTable getTableTimestampDef();

	/**
	 *	Get the TimestampType Table interface for the schema.
	 *
	 *	@return	The TimestampType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTimestampTypeTable getTableTimestampType();

	/**
	 *	Get the TokenCol Table interface for the schema.
	 *
	 *	@return	The TokenCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTokenColTable getTableTokenCol();

	/**
	 *	Get the TokenDef Table interface for the schema.
	 *
	 *	@return	The TokenDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTokenDefTable getTableTokenDef();

	/**
	 *	Get the TokenType Table interface for the schema.
	 *
	 *	@return	The TokenType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTokenTypeTable getTableTokenType();

	/**
	 *	Get the Tweak Table interface for the schema.
	 *
	 *	@return	The Tweak Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtTweakTable getTableTweak();

	/**
	 *	Get the UInt16Col Table interface for the schema.
	 *
	 *	@return	The UInt16Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt16ColTable getTableUInt16Col();

	/**
	 *	Get the UInt16Def Table interface for the schema.
	 *
	 *	@return	The UInt16Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt16DefTable getTableUInt16Def();

	/**
	 *	Get the UInt16Type Table interface for the schema.
	 *
	 *	@return	The UInt16Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt16TypeTable getTableUInt16Type();

	/**
	 *	Get the UInt32Col Table interface for the schema.
	 *
	 *	@return	The UInt32Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt32ColTable getTableUInt32Col();

	/**
	 *	Get the UInt32Def Table interface for the schema.
	 *
	 *	@return	The UInt32Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt32DefTable getTableUInt32Def();

	/**
	 *	Get the UInt32Type Table interface for the schema.
	 *
	 *	@return	The UInt32Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt32TypeTable getTableUInt32Type();

	/**
	 *	Get the UInt64Col Table interface for the schema.
	 *
	 *	@return	The UInt64Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt64ColTable getTableUInt64Col();

	/**
	 *	Get the UInt64Def Table interface for the schema.
	 *
	 *	@return	The UInt64Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt64DefTable getTableUInt64Def();

	/**
	 *	Get the UInt64Type Table interface for the schema.
	 *
	 *	@return	The UInt64Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUInt64TypeTable getTableUInt64Type();

	/**
	 *	Get the Uuid6Col Table interface for the schema.
	 *
	 *	@return	The Uuid6Col Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUuid6ColTable getTableUuid6Col();

	/**
	 *	Get the Uuid6Def Table interface for the schema.
	 *
	 *	@return	The Uuid6Def Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUuid6DefTable getTableUuid6Def();

	/**
	 *	Get the Uuid6Gen Table interface for the schema.
	 *
	 *	@return	The Uuid6Gen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUuid6GenTable getTableUuid6Gen();

	/**
	 *	Get the Uuid6Type Table interface for the schema.
	 *
	 *	@return	The Uuid6Type Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUuid6TypeTable getTableUuid6Type();

	/**
	 *	Get the UuidCol Table interface for the schema.
	 *
	 *	@return	The UuidCol Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUuidColTable getTableUuidCol();

	/**
	 *	Get the UuidDef Table interface for the schema.
	 *
	 *	@return	The UuidDef Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUuidDefTable getTableUuidDef();

	/**
	 *	Get the UuidGen Table interface for the schema.
	 *
	 *	@return	The UuidGen Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUuidGenTable getTableUuidGen();

	/**
	 *	Get the UuidType Table interface for the schema.
	 *
	 *	@return	The UuidType Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtUuidTypeTable getTableUuidType();

	/**
	 *	Get the Value Table interface for the schema.
	 *
	 *	@return	The Value Table interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	public ICFBamProtValueTable getTableValue();

	/**
	 *	Get the Table Permissions interface for the schema.
	 *
	 *	@return	The Table Permissions interface for the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	//public static ICFSecProtTablePerms getTablePerms();

	/**
	 *	Get the Table Permissions interface cast to this schema's implementation.
	 *
	 *	@return The Table Permissions interface for this schema.
	 */
	//public static ICFSecProtTablePerms getCFSecProtTablePerms();

	/**
	 *	Set the Table Permissions interface for the schema.  All fractal subclasses of
	 *	the ICFSecProtTablePerms implement at least that interface plus their own
	 *	accessors.
	 *
	 *	@param	value	The Table Permissions interface to be used by the schema.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	//public static void setTablePerms( ICFSecProtTablePerms value );

	public void bootstrapSchema(CFSecProtTableData tableData[]);
	public void bootstrapAllTablesSecurity(CFLibDbKeyHash256 clusterId, CFLibDbKeyHash256 tenantId, CFSecProtTableData tableData[]);
}
